SUMMARY = "QML Box2D plugin"
DESCRIPTION = "This plugin is meant to be installed to your Qt/imports directory, or shipped \
in a directory of which the parent is added as import path. \
 \
The goal is to expose the functionality of Box2D as QML components, in order \
to make it easy to write physics-based games in QML."
LICENSE = "Zlib"

PV = "0+git.1523004651.b7212d5"

RPM_NAME = "qml-box2d-0+git.1523004651.b7212d5-1.11.aarch64.rpm"
RPM_HASH = "4fdf98ba167d1c5e506fac392dfd98e7407a1a854b1a3cf83a8215a90496136fd6cd138d3e0d05ebbacfbda4eb5a5a1c62126269a5d820ac6ec6f6a78363a77f"

RPROVIDES:${PN} += "libBox2D.so()(64bit) qml-box2d qml-box2d(aarch-64) qt5qmlimport(Box2D.2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
