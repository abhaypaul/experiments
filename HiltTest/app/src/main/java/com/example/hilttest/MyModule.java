package com.example.hilttest;



import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public class MyModule {

    @Provides
    public static TestClass provideTestClass(
            // Potential dependencies of this type
    ) {
      return  new TestClass();
    }

}
