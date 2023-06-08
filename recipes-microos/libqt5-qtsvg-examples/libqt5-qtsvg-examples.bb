SUMMARY = "Qt5 SVG examples"
DESCRIPTION = "Examples for the libqt5-qtsvg modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde7"

RPM_NAME = "libqt5-qtsvg-examples-5.15.9+kde7-1.1.aarch64.rpm"
RPM_HASH = "15dcf9656a6667648c8b667ccdd0f0e8ac227611122aab54e66d0370937679558718047eb72ec2a64f98393b08b2be3f7d92a14a1cb8f1bcc2d2672d95455d18"

RPROVIDES:${PN} += "libqt5-qtsvg-examples libqt5-qtsvg-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
