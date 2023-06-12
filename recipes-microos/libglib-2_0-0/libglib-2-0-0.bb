SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "libglib-2_0-0-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "3ceea7bc37f9e339cd922b02efa282cc5c7a2228ffb14e18105f3ce7bed6cf335ae5273ef2bc6bb7864ddbc80d2566ca68b8090745bdb1c9713b1f8c506d86ab"

RPROVIDES:${PN} += "glib2 libglib-2.0.so.0()(64bit) libglib-2_0-0 libglib-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcre2-8.so.0()(64bit)"

inherit rpm
