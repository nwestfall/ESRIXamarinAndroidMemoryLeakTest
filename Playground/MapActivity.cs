using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.Util;

using Esri.ArcGISRuntime.Mapping;
using Esri.ArcGISRuntime.UI.Controls;
using Esri.ArcGISRuntime.Geometry;

namespace Playground
{
    [Activity(Label = "MapActivity", NoHistory = true)]
    public class MapActivity : Activity
    {
        MapView mapView;
        Map map;


        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.Map);

            mapView = FindViewById<MapView>(Resource.Id.MapView);
            map = new Map(Basemap.CreateImagery());
            //map = new Map(Basemap.CreateTopographic());
            mapView.Map = map;
        }

        protected override void OnDestroy()
        {
            base.OnDestroy();

            map = null;

            mapView.Map = null;
            //mapView?.Dispose(); //Uncomment this, and you'll get the following error
            /* Unhandled Exception:
            System.NotSupportedException: Unable to activate instance of type Esri.ArcGISRuntime.UI.Controls.MapView from native handle 0xbee5250c (key_handle 0x1db8e4f5). ---> System.MissingMethodException: No constructor found for Esri.ArcGISRuntime.UI.Controls.MapView::.ctor(System.IntPtr, Android.Runtime.JniHandleOwnership) ---> Java.Interop.JavaLocationException: Exception of type 'Java.Interop.JavaLocationException' was thrown.
            --- End of inner exception stack trace ---
            at Java.Interop.TypeManager.CreateProxy (System.Type type, System.IntPtr handle, Android.Runtime.JniHandleOwnership transfer) [0x00054] in <8211f1f12f9e45838d631abf63e51c79>:0 
            at Java.Interop.TypeManager.CreateInstance (System.IntPtr handle, Android.Runtime.JniHandleOwnership transfer, System.Type targetType) [0x00111] in <8211f1f12f9e45838d631abf63e51c79>:0 
            --- End of inner exception stack trace ---
            at (wrapper dynamic-method) System.Object:c5a9f3b8-ef56-42b2-9e79-cd3b292adb65 (intptr,intptr)
            [ERROR] FATAL UNHANDLED EXCEPTION: System.NotSupportedException: Unable to activate instance of type Esri.ArcGISRuntime.UI.Controls.MapView from native handle 0xbee5250c (key_handle 0x1db8e4f5). ---> System.MissingMethodException: No constructor found for Esri.ArcGISRuntime.UI.Controls.MapView::.ctor(System.IntPtr, Android.Runtime.JniHandleOwnership) ---> Java.Interop.JavaLocationException: Exception of type 'Java.Interop.JavaLocationException' was thrown.
            */
            mapView = null;
        }
    }
}
 