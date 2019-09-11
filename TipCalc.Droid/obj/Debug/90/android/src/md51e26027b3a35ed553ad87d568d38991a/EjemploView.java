package md51e26027b3a35ed553ad87d568d38991a;


public class EjemploView
	extends md5231beb04e46a1dc811e36737109a7a02.MvxActivity_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("TipCalc.UI.Droid.Views.EjemploView, TipCalc.UI.Droid", EjemploView.class, __md_methods);
	}


	public EjemploView ()
	{
		super ();
		if (getClass () == EjemploView.class)
			mono.android.TypeManager.Activate ("TipCalc.UI.Droid.Views.EjemploView, TipCalc.UI.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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
