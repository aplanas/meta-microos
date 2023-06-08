SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "gtk4-tools-4.10.3-4.1.aarch64.rpm"
RPM_HASH = "7555eb6c3a38a7dd0388da8fd0ecf17721b912196b1c8d7776d3a39ef2fb013ecc46ac3ada4f0bfcf0ad17a47dcc386ad09ddc5ae990bc8360e76e4b0a40b8f3"

RPROVIDES:${PN} += "gtk4-tools gtk4-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit)"

inherit rpm
