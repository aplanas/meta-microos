SUMMARY = "Logo Programming Environment"
DESCRIPTION = "KTurtle is an educational Logo programming environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kturtle-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "17329ee5b4ff12da1248979328fb620c30927815970f8a8aff5753ab45392ade174ca44fcfcfa5dfa99cd48c7db31a4ee699728a97e150fb01fd69130f093dcc"

RPROVIDES:${PN} += "application() application(org.kde.kturtle.desktop) config(kturtle) kturtle kturtle(aarch-64) kturtle5 metainfo() metainfo(org.kde.kturtle.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5NewStuffWidgets.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
