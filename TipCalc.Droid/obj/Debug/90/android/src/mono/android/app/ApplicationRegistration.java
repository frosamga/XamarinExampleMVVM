package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("TipCalc.UI.Droid.MainApplication, TipCalc.UI.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", md59e9f7473de37556e98d90f7f061d28a0.MainApplication.class, md59e9f7473de37556e98d90f7f061d28a0.MainApplication.__md_methods);
		mono.android.Runtime.register ("MvvmCross.Platforms.Android.Views.MvxAndroidApplication, MvvmCross, Version=6.2.2.0, Culture=neutral, PublicKeyToken=null", md5231beb04e46a1dc811e36737109a7a02.MvxAndroidApplication.class, md5231beb04e46a1dc811e36737109a7a02.MvxAndroidApplication.__md_methods);
		mono.android.Runtime.register ("MvvmCross.Platforms.Android.Views.MvxAndroidApplication`2, MvvmCross, Version=6.2.2.0, Culture=neutral, PublicKeyToken=null", md5231beb04e46a1dc811e36737109a7a02.MvxAndroidApplication_2.class, md5231beb04e46a1dc811e36737109a7a02.MvxAndroidApplication_2.__md_methods);
		
	}
}