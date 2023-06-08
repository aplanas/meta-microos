SUMMARY = "Tools from glib2, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "glib2-tools-2.76.2-1.1.aarch64.rpm"
RPM_HASH = "23e564c76ea6399273c3f56136485794e74eb3d63e09af6c9e7d2b5b432a03f9ed468c7dc6636d5cfc2152d6f62e299940eca356a9e2b2ab3c583c6235940e56"

RPROVIDES:${PN} += "glib2-tools glib2-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libgio-2.0.so.0()(64bit) libgio-2_0-0 libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
