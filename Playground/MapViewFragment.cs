using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Util;
using Android.Views;
using Android.Widget;

using Esri.ArcGISRuntime.Mapping;
using Esri.ArcGISRuntime.UI.Controls;
using Esri.ArcGISRuntime.Geometry;


namespace Playground
{
    public class MapViewFragment : Fragment
    {
        MapView mapView;
        Map map;


        public override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Create your fragment here
        }

        public override View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            var view = inflater.Inflate(Resource.Layout.MapFrag, container, false);

            mapView = view.FindViewById<MapView>(Resource.Id.MapViewFrag);
            map = new Map(Basemap.CreateImagery());

            mapView.Map = map;

            return view;
        }
    }
}