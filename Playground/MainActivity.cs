using Android.App;
using Android.Widget;
using Android.OS;

using Java.Lang;
using Java.IO;
using Android.Content;
using System.Threading;
using Android.Runtime;

namespace Playground
{
    [Activity(Label = "Playground", MainLauncher = true)]
    public class MainActivity : Activity
    {
        Button goToMap;
        Button goToMapFrag;
        Button goToControl;
        Button gcx;
        Button GoToMapN;
        TextView MemUsage;
        int MapRuns = 0;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            goToMap = FindViewById<Button>(Resource.Id.GoToMap);
            goToMap.Click += GoToMap_Click;

            goToMapFrag = FindViewById<Button>(Resource.Id.GoToMapFrag);
            goToMapFrag.Click += GoToMapFrag_Click;

            goToControl = FindViewById<Button>(Resource.Id.GoToControl);
            goToControl.Click += GoToControl_Click;

            GoToMapN = FindViewById<Button>(Resource.Id.GoToMapN);
            GoToMapN.Click += GoToMapN_Click;

            gcx = FindViewById<Button>(Resource.Id.gcx);

            gcx.Click += Gcx_Click;

            MemUsage = FindViewById<TextView>(Resource.Id.MemUsage);

            new System.Threading.Thread(new ThreadStart(async () =>
            {
                while (true)
                {
                    var mi = new global::Android.OS.Debug.MemoryInfo();
                    Debug.GetMemoryInfo(mi);

                    RunOnUiThread(() => MemUsage.Text = "PSS Memory: " + mi.TotalPss.ToString() + " kB");

                    await System.Threading.Tasks.Task.Delay(1000);
                }
            })).Start();
        }

        private void GoToMapFrag_Click(object sender, System.EventArgs e)
        {
            Intent i = new Intent(this, typeof(MapFragActivity));
            i.PutExtra("SelfTerminate", true);
            StartActivity(i);
        }

        private void GoToMapN_Click(object sender, System.EventArgs e)
        {
            MapRuns = 10;
            CallMapActivityAsync();
        }

        private async void CallMapActivityAsync()
        {
            if (MapRuns-- > 0)
            {
                Intent i = new Intent(this, typeof(MapActivity));
                i.PutExtra("SelfTerminate", true);

                await System.Threading.Tasks.Task.Delay(1000);
                StartActivityForResult(i, 1);
            }
        }

        protected override void OnActivityResult(int requestCode, [GeneratedEnum] Result resultCode, Intent data)
        {
            base.OnActivityResult(requestCode, resultCode, data);

            TakeOutTheGarbage();

            if (requestCode == 1)
            {
                CallMapActivityAsync();
            }
        }

        private void Gcx_Click(object sender, System.EventArgs e)
        {
            var s = new System.Diagnostics.Stopwatch();

            s.Start();

            TakeOutTheGarbage();

            s.Stop();

            gcx.Text = "Call the GC 3x: " + s.ElapsedMilliseconds.ToString();
        }

        private static void TakeOutTheGarbage()
        {
            System.GC.Collect();
            System.GC.WaitForPendingFinalizers();
            System.GC.Collect();
            System.GC.WaitForPendingFinalizers();
            System.GC.Collect();
            System.GC.WaitForPendingFinalizers();
        }

        private void GoToControl_Click(object sender, System.EventArgs e)
        {
            //Intent i = new Intent(this, typeof(ControlActivity));
            //StartActivity(i);

            System.GC.Collect();
            System.GC.WaitForPendingFinalizers();
        }

        private void GoToMap_Click(object sender, System.EventArgs e)
        {
            Intent i = new Intent(this, typeof(MapActivity));
            i.PutExtra("SelfTerminate", true);
            StartActivity(i);
        }

    }
}