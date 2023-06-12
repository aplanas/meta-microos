SUMMARY = "Screen Magnifier"
DESCRIPTION = "Magnifies a part of the screen."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kmag-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0d4c93a9b3ff6b68d03b2ebc6c747245845ac166821e72156f7fdaedfca26ae0c9370e3540ee959332456e04c72d2af0d0d948f9581ef4484beb0cb7f0a98712"

RPROVIDES:${PN} += "application() application(org.kde.kmag.desktop) kmag kmag(aarch-64) kmag5 metainfo() metainfo(org.kde.kmag.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
