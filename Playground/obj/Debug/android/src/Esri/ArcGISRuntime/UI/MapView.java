package Esri.ArcGISRuntime.UI;


public class MapView
	extends md568c46805a88b6446a94763fe0b493443.GeoView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"";
		mono.android.Runtime.register ("Esri.ArcGISRuntime.UI.Controls.MapView, Esri.ArcGISRuntime, Version=100.2.0.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", MapView.class, __md_methods);
	}


	public MapView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MapView.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Controls.MapView, Esri.ArcGISRuntime, Version=100.2.0.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public MapView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MapView.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Controls.MapView, Esri.ArcGISRuntime, Version=100.2.0.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public MapView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MapView.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Controls.MapView, Esri.ArcGISRuntime, Version=100.2.0.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MapView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MapView.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Controls.MapView, Esri.ArcGISRuntime, Version=100.2.0.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
