SUMMARY = "Tools from glib2, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "glib2-tools-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "5fc7701dd59f9ba673e60123e661c89a4d7b6fae20027a70790573f08b394e78917c6fd7a4b6e1863f74e6afe9096b891ad9c9c60f052758e29853d9108cc83c"

RPROVIDES:${PN} += "glib2-tools glib2-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libgio-2.0.so.0()(64bit) libgio-2_0-0 libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
