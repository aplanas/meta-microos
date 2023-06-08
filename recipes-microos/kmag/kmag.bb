SUMMARY = "Screen Magnifier"
DESCRIPTION = "Magnifies a part of the screen."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kmag-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b40037e6d93f222c63beb7ef74004cb97c976f12053d8bf095be11934a6f8bdf77743c88afdd330a5f92afdc153cb518808c50cd63a0e85e21c7c193989c7c58"

RPROVIDES:${PN} += "application() application(org.kde.kmag.desktop) kmag kmag(aarch-64) kmag5 metainfo() metainfo(org.kde.kmag.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
