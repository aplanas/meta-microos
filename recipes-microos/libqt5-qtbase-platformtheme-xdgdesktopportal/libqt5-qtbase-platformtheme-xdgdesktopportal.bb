SUMMARY = "Qt 5 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 5 plugin for integration with flatpak and snap."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libqt5-qtbase-platformtheme-xdgdesktopportal-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "aa1c58bf4da7f6143bf740924388082999c9c5f0d42be7c1c498d9ccd5880dc17ad911775e8d0e07c39ea339c7418823f1272d99ad458dcb35b62fc837e210bd"

RPROVIDES:${PN} += "libqt5-qtbase-platformtheme-flatpak libqt5-qtbase-platformtheme-xdgdesktopportal libqt5-qtbase-platformtheme-xdgdesktopportal(aarch-64) libqxdgdesktopportal.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
