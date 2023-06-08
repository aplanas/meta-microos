SUMMARY = "Application to take pictures and videos using a webcam"
DESCRIPTION = "Kamoso is an application to take pictures and videos using a webcam. \
The media can be pushed to some web services such as Facebook and \
YouTube."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kamoso-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f6fd3b32457a0fdcf7a50e27e1e67ba1bbc8dcfc2bf7b0287421bfb01fed2daf0051186b71c269e476cb6aafc03d2ccc7fd1978636dab161e06870d22c1f54c0"

RPROVIDES:${PN} += "application() application(org.kde.kamoso.desktop) kamoso kamoso(aarch-64) metainfo() metainfo(org.kde.kamoso.appdata.xml)"
RDEPENDS:${PN} += "gstreamer-plugins-bad gstreamer-plugins-base gstreamer-plugins-good kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
