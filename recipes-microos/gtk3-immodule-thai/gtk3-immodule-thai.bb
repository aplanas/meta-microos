SUMMARY = "Thai-Lao input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Thai-Lao."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-thai-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "bd0ca18e71bf4a498ad6686c1a9e8885d07c3653abf1099055963a291bd60e48b6bf7a9646ded790b92e3dafb64ca8402478f3bcce722ce6d3ecd32ae77e8e1b"

RPROVIDES:${PN} += "gtk3-immodule-thai gtk3-immodule-thai(aarch-64) locale(gtk3:lo) locale(gtk3:th)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
