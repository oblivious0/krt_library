# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#指定压缩级别
-optimizationpasses 5
#不去忽略非公共的库类
-dontskipnonpubliclibraryclasses
#包明不混合大小写
-dontusemixedcaseclassnames
#优化  不优化输入的类文件
-dontoptimize
 #预校验
-dontpreverify
 #混淆时是否记录日志
-verbose
 # 混淆时所采用的算法
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

#保护注解
-keepattributes *Annotation*
# 保持哪些类不被混淆
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class com.android.vending.licensing.ILicensingService
-keep public class com.google.vending.licensing.ILicensingService
#如果有引用v4包可以添加下面这行
-keep public class * extends android.support.v4.app.Fragment
-keep class android.support.v4.** { *; }

#忽略警告
-ignorewarning

##记录生成的日志数据,gradle build时在本项目根目录输出##
#apk 包内所有 class 的内部结构
-dump proguard/class_files.txt
#未混淆的类和成员
-printseeds proguard/seeds.txt
#列出从 apk 中删除的代码
-printusage proguard/unused.txt
#混淆前后的映射
-printmapping proguard/mapping.txt
########记录生成的日志数据，gradle build时 在本项目根目录输出-end######

#如果引用了v4或者v7包
-dontwarn android.support.**

####混淆保护自己项目的部分代码以及引用的第三方jar包library-end####

#不混淆泛型
-keepattributes Signature
#保持 native 方法不被混淆
-keepclasseswithmembernames class * {
    native <methods>;
}

#保持自定义控件类不被混淆
-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet);
}

#保持自定义控件类不被混淆
-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}

-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
    public void set*(...);
}

#保持 Parcelable 不被混淆
-keep class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator *;
}

#保持 Serializable 不被混淆
-keepnames class * implements java.io.Serializable

#保持 Serializable 不被混淆并且enum 类也不被混淆
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    !private <fields>;
    !private <methods>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

#保持枚举 enum 类不被混淆
-keepclassmembers enum * {
  public static **[] values();
  public static ** valueOf(java.lang.String);
}

-keepclassmembers class * {
    public void *ButtonClicked(android.view.View);
}

#不混淆资源类
-keepclassmembers class **.R$* {
    public static <fields>;
}

#保证是独立的jar,没有任何项目引用,如果不写就会认为我们所有的代码是无用的,从而把所有的代码压缩掉,导出一个空的jar
-dontshrink
-repackageclasses ''
-allowaccessmodification
-dontskipnonpubliclibraryclassmembers
-printmapping proguardMapping.txt
-keepattributes *Annotation*,InnerClasses
-keepattributes SourceFile,LineNumberTable
-keep class **.R$* {   *;  }
# 保持内部类
-keepattributes InnerClasses,EnclosingMethod
-dontoptimize
-optimizations optimization_filter

#保留annotation， 例如 @JavascriptInterface 等 annotation
-keepattributes *Annotation*

#保留跟 javascript相关的属性
-keepattributes JavascriptInterface

#保留JavascriptInterface中的方法
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

#这个根据自己的project来设置，这个类用来与js交互，所以这个类中的 字段 ，方法， 等尽量保持
-keepclassmembers public class krt.wid.tour_gz.fragment.WebFragment{
   <fields>;
   <methods>;
   public *;
   private *;
}

#防止javaBean被混淆引发空指针
-keep public class com.krt.jxtalent.bean.**{*;}


#避免混淆泛型 如果混淆报错建议关掉

#移除Log类打印各个等级日志的代码，打正式包的时候可以做为禁log使用，这里可以作为禁止log打印的功能使用，另外的一种实现方案是通过BuildConfig.DEBUG的变量来控制
#-assumenosideeffects class android.util.Log {
#    public static *** v(...);
#    public static *** i(...);
#    public static *** d(...);
#    public static *** w(...);
#    public static *** e(...);
#}


#######################     常用第三方模块的混淆选项         ###################################
#gson
# Gson specific classes
-keep class sun.misc.Unsafe { *; }
# Application classes that will be serialized/deserialized over Gson
-keep class com.google.gson.** { *; }
-keep class com.google.gson.stream.** { *; }

#butterknife
-keep class butterknife.** { *; }
-dontwarn butterknife.internal.**
-keep class **$$ViewBinder { *; }

-keepclasseswithmembernames class * {
    @butterknife.* <fields>;
}

-keepclasseswithmembernames class * {
    @butterknife.* <methods>;
}

##glide
#-keep public class * implements com.bumptech.glide.module.GlideModule
#-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
#  **[] $VALUES;
#  public *;
#}
## youthbanner
#-keep class com.youth.banner.** {
#    *;
# }
# # zbar
# -keepclassmembers class * {
#     native <methods>;
# }
#
# -keepclasseswithmembernames class * {
#     native <methods>;
# }
# #ijkplayer
# -keep class tv.danmaku.ijk.media.player.** {*;}
# -keep class tv.danmaku.ijk.media.player.IjkMediaPlayer{*;}
# -keep class tv.danmaku.ijk.media.player.ffmpeg.FFmpegApi{*;}
# #netty
# -keepattributes Signature,InnerClasses
# -keepclasseswithmembers class io.netty.** {
#     *;
# }
# -dontwarn io.netty.**
# -dontwarn sun.**
# #jpush
# -dontwarn cn.jpush.**
# -keep class cn.jpush.** { *; }
# -keep class * extends cn.jpush.android.helpers.JPushMessageReceiver { *; }
#
# -dontwarn cn.jiguang.**
# -keep class cn.jiguang.** { *; }
 #baseRecycerview
 -keep class com.chad.library.adapter.** {
 *;
 }
 -keep public class * extends com.chad.library.adapter.base.BaseQuickAdapter
 -keep public class * extends com.chad.library.adapter.base.BaseViewHolder
 -keepclassmembers  class **$** extends com.chad.library.adapter.base.BaseViewHolder {
      <init>(...);
 }
 #matise
 -dontwarn com.bumptech.glide.**
 #vlayout
 -keepattributes InnerClasses
 -keep class com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx { *; }
 -keep class android.support.v7.widget.RecyclerView$LayoutParams { *; }
 -keep class android.support.v7.widget.RecyclerView$ViewHolder { *; }
 -keep class android.support.v7.widget.ChildHelper { *; }
 -keep class android.support.v7.widget.ChildHelper$Bucket { *; }
 -keep class android.support.v7.widget.RecyclerView$LayoutManager { *; }
#eventbus
-keepclassmembers class * {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }

# Only required if you use AsyncExecutor
#-keepclassmembers class * extends org.greenrobot.eventbus.util.ThrowableFailureEvent {
#    <init>(java.lang.Throwable);
#}
##baidu
#-keep class com.baidu.** { *; }
#-keep class vi.com.gdi.bgl.android.**{*;}
##融云混淆
#-keep class io.rong.imkit.** {*;}
#-keep class io.rong.imlib.** {*;}
#-keepattributes Exceptions,InnerClasses
#-dontwarn io.rong.**
#-keep class io.rong.** {*;}
#-keep public class krt.wid.tour_gz.R** {*;} #自己的包名
#-keep class *.R$ { *; }
#fastjson
-dontwarn com.alibaba.fastjson.**

-keep class com.alibaba.fastjson.** { *; }

-keep public class krt.wid.nohttp.bean.** {*;}
#basemodule混淆
-keep class krt.wid.http.**{*;}
#okgo
-dontwarn com.lzy.okgo.**
-keep class com.lzy.okgo.**{*;}
#avloadingview
-keep class com.wang.avi.**{*;}
