SUMMARY = "Qt 6 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 6 plugin for integration with Flatpak and Snap."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-platformtheme-xdgdesktopportal-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "ee9cc8a0032f8068a3925bb0efeda6df401f4ee4d5f41ed8ed50b0876b5f73eabfea055cd55bb381a3f15080ab5401b871d659cfd3104787cba0417f832f941e"

RPROVIDES:${PN} += "libqxdgdesktopportal.so()(64bit) libqxdgdesktopportal.so(Qt_6)(64bit) libqxdgdesktopportal.so(Qt_6.0)(64bit) libqxdgdesktopportal.so(Qt_6.1)(64bit) libqxdgdesktopportal.so(Qt_6.2)(64bit) libqxdgdesktopportal.so(Qt_6.3)(64bit) libqxdgdesktopportal.so(Qt_6.4)(64bit) libqxdgdesktopportal.so(Qt_6.5)(64bit) libqxdgdesktopportal.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-platformtheme-xdgdesktopportal qt6-platformtheme-xdgdesktopportal(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui6 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
