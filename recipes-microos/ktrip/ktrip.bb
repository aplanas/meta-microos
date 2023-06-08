SUMMARY = "Public transport assistant targeted towards mobile Linux and Android"
DESCRIPTION = "KTrip is a public transport assistant targeted towards mobile Linux and \
Android. It allows to query journeys for a wide range of countries/public \
transport providers by leveraging KPublicTransport."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktrip-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "dbe8216d4c0516ba8b152a82bec7f1a9813c95fbece48fd63cdaefd2dfd1422db0ed9d9d0921161bf80a79ed2dbff689c533e4bbec1c6d0b73751981d629ae3d"

RPROVIDES:${PN} += "application() application(org.kde.ktrip.desktop) ktrip ktrip(aarch-64) metainfo() metainfo(org.kde.ktrip.appdata.xml)"
RDEPENDS:${PN} += "breeze5-icons kirigami2 kpublictransport ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPublicTransport.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
