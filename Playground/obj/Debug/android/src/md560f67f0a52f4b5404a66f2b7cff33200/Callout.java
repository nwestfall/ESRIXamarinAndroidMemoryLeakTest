package md560f67f0a52f4b5404a66f2b7cff33200;


public class Callout
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Esri.ArcGISRuntime.UI.Callout, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", Callout.class, __md_methods);
	}


	public Callout (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Callout.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Callout, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public Callout (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == Callout.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Callout, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public Callout (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == Callout.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Callout, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public Callout (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == Callout.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.Callout, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

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