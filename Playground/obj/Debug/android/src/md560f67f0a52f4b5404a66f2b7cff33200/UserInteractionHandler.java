package md560f67f0a52f4b5404a66f2b7cff33200;


public abstract class UserInteractionHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Esri.ArcGISRuntime.UI.UserInteractionHandler, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", UserInteractionHandler.class, __md_methods);
	}


	public UserInteractionHandler ()
	{
		super ();
		if (getClass () == UserInteractionHandler.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.UserInteractionHandler, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "", this, new java.lang.Object[] {  });
	}

	public UserInteractionHandler (md58f40a8d05e9311c15b7f7310411c2403.GeoView p0)
	{
		super ();
		if (getClass () == UserInteractionHandler.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.UI.UserInteractionHandler, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "Esri.ArcGISRuntime.UI.Controls.GeoView, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", this, new java.lang.Object[] { p0 });
	}

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
