SUMMARY = "Qt5 SVG examples"
DESCRIPTION = "Examples for the libqt5-qtsvg modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde8"

RPM_NAME = "libqt5-qtsvg-examples-5.15.9+kde8-1.1.aarch64.rpm"
RPM_HASH = "c6c29a2f9077dcb042109e700910a963c0adc53a720f595e6431011fd1a476954af64c4893a83b08af325a879b156697ac6140ee4b1ab577ce4fd323e906046d"

RPROVIDES:${PN} += "libqt5-qtsvg-examples libqt5-qtsvg-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
