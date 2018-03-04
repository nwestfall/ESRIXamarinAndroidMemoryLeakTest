using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace Playground
{
    [Activity(Label = "MapFragActivity")]
    public class MapFragActivity : Activity
    {
        MapViewFragment frag;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.MapFragContainer);

            frag = this.FragmentManager.FindFragmentByTag<MapViewFragment>("bkSUX");

            if (frag == null)
            {
                frag = new MapViewFragment();
            }

            FragmentTransaction fragmentTx = this.FragmentManager.BeginTransaction();

            fragmentTx.Add(Resource.Id.MapFragmentContainer, frag, "bkSUX");
            //fragmentTx.AddToBackStack("bkSUX");

            fragmentTx.Commit();

        }


        private void AddMyView()
        {
            //this.AddMyView(void);

        }

        private void RemoveMapView()
        {
            FragmentTransaction fragmentTx = this.FragmentManager.BeginTransaction();

            fragmentTx.Remove(frag);

            fragmentTx.Commit();
        }

        protected override void OnStop()
        {
            base.OnStop();

            RemoveMapView();
        }

        protected override void OnDestroy()
        {
            base.OnDestroy();
        }
    }
}