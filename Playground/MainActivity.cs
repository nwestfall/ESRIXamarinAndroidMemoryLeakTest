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

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            StrictMode.SetVmPolicy(new StrictMode.VmPolicy.Builder()
                .DetectAll()
                //.PenaltyDeath()
                .PenaltyLog()
                .Build());
            StrictMode.SetThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .DetectAll()
                .PenaltyDeathOnNetwork()
                .PenaltyFlashScreen()
                .PenaltyLog()
                .PenaltyDialog()
                .Build());

            goToMap = FindViewById<Button>(Resource.Id.GoToMap);
            goToMap.Click += GoToMap_Click;
        }

        private void GoToMap_Click(object sender, System.EventArgs e)
        {
            Intent i = new Intent(this, typeof(MapActivity));
            StartActivity(i);
        }
    }
}