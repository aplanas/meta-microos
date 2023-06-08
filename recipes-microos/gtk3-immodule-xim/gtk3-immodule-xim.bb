SUMMARY = "X input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method based on the X Input Method."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-xim-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "ad5edc58fab7a980ec3f51ec4ae6f3ab958e4c256ea1f4e01d3d3b67d8a83657bbb1d01e8365cd31001ede1e30b48fef6423972c22663adc1e3fcf16d0909570"

RPROVIDES:${PN} += "gtk3-immodule-xim gtk3-immodule-xim(aarch-64) locale(gtk3:ja) locale(gtk3:ko) locale(gtk3:th) locale(gtk3:zh)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
