package md5978de496cf53a97ac2c723b2a7c8f484;


public abstract class CompassProvider
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Esri.ArcGISRuntime.Location.CompassProvider, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", CompassProvider.class, __md_methods);
	}


	public CompassProvider ()
	{
		super ();
		if (getClass () == CompassProvider.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.Location.CompassProvider, Esri.ArcGISRuntime, Version=100.2.1.0, Culture=neutral, PublicKeyToken=8fc3cc631e44ad86", "", this, new java.lang.Object[] {  });
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
