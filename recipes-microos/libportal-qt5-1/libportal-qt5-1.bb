SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-qt5-1-0.6-1.7.aarch64.rpm"
RPM_HASH = "45852ca02e5c8d4c3202405e26694317427d28adceff1025fdf0ae429b5853f1c94186b00489c88e7e7db5760c88eafb0dc1eda85541c6c2aaf56ac61d8dd31e"

RPROVIDES:${PN} += "libportal-qt5-1 libportal-qt5-1(aarch-64) libportal-qt5.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libportal.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
