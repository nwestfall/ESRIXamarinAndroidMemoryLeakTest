using Android.App;
using Android.Widget;
using Android.OS;

using Java.Lang;
using Java.IO;
using Android.Content;

namespace Playground
{
    [Activity(Label = "Playground", MainLauncher = true)]
    public class MainActivity : Activity
    {
        Button goToMap;
        Button goToControl;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            goToMap = FindViewById<Button>(Resource.Id.GoToMap);
            goToMap.Click += GoToMap_Click;

            goToControl = FindViewById<Button>(Resource.Id.GoToControl);
            goToControl.Click += GoToControl_Click;

        }

        private void GoToControl_Click(object sender, System.EventArgs e)
        {
            Intent i = new Intent(this, typeof(ControlActivity));
            StartActivity(i);
        }

        private void GoToMap_Click(object sender, System.EventArgs e)
        {
            Intent i = new Intent(this, typeof(MapActivity));
            StartActivity(i);
        }

    }
}