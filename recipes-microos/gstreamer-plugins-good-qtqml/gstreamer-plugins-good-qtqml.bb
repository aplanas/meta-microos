SUMMARY = "Qmlglsink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the qmlglsink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-good-qtqml-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "ba88d59a3be644074eb3394bc8983e3f0e119e2d4d34dc349c1bf6a7a052e7387eb27174a1aa8626e3860976eb47c7bac503c56fb188033e9fc57bfd5cb7939f"

RPROVIDES:${PN} += "gstreamer-plugins-good-qtqml gstreamer-plugins-good-qtqml(aarch-64) gstreamer1(element-qmlgloverlay)()(64bit) gstreamer1(element-qmlglsink)()(64bit) gstreamer1(element-qmlglsrc)()(64bit) libgstqmlgl.so()(64bit)"
RDEPENDS:${PN} += "gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenGL.so.0()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstgl-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
