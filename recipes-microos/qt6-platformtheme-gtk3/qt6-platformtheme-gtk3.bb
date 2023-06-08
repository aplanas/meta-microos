SUMMARY = "Qt 6 GTK3 plugin"
DESCRIPTION = "Qt 6 plugin for better integration with GTK3-based desktop environments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-platformtheme-gtk3-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "62743b971dcfe797a8f6274572e4bc58e1eb718693d2b9e714dfeea27f6e072fda8336ecf04a297cafb7b7aff12e7d1b74cbe622a9d4db654d4510b5bca92634"

RPROVIDES:${PN} += "libqgtk3.so()(64bit) libqgtk3.so(Qt_6)(64bit) libqgtk3.so(Qt_6.0)(64bit) libqgtk3.so(Qt_6.1)(64bit) libqgtk3.so(Qt_6.2)(64bit) libqgtk3.so(Qt_6.3)(64bit) libqgtk3.so(Qt_6.4)(64bit) libqgtk3.so(Qt_6.5)(64bit) libqgtk3.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-platformtheme-gtk3 qt6-platformtheme-gtk3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui6 libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
