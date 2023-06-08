SUMMARY = "Qt tool for creating screenshots"
DESCRIPTION = "Screenshot taker with the ability to publish them via hosting services."
LICENSE = "GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "screengrab-2.6.0-1.1.aarch64.rpm"
RPM_HASH = "14afb1358dc701495b11169c401097ff7adb03d1872f5668062de1e61e72917efa7d6b1e217e2eb5f379e3247be095090aed3ae38b3131a327b203ed4d4cf6a8"

RPROVIDES:${PN} += "application() application(screengrab.desktop) metainfo() metainfo(screengrab.metainfo.xml) screengrab screengrab(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xdg.so.3()(64bit) libX11-xcb.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxcb-xfixes.so.0()(64bit)"

inherit rpm
