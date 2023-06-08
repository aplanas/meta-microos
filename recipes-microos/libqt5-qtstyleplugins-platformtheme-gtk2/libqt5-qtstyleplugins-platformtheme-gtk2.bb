SUMMARY = "Qt 5 gtk2 plugin"
DESCRIPTION = "Qt 5 plugin for better integration with gtk-based desktop enviroments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-platformtheme-gtk2-5.0.0+git20170311-10.10.aarch64.rpm"
RPM_HASH = "20fc024ab151b65bd97f6137fc9e4b94844df86deb2456e2158f0e9e12e6edd5423cdef08e5ad27e80d9883d5b5d4acaec3c6f1c2473b66de51bdf85f72e50a4"

RPROVIDES:${PN} += "libqgtk2.so()(64bit) libqgtk2style.so()(64bit) libqt5-qtstyleplugins-platformtheme-gtk2 libqt5-qtstyleplugins-platformtheme-gtk2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
