SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "libglib-2_0-0-2.76.2-1.1.aarch64.rpm"
RPM_HASH = "71be9b89d0a4683c9a88d112137e5f9c6c171f1f6de455f4d98f356277b6b15eaad1fd86b65c64fc3aee666f2dcbb814503c6fc0a17967bf306e8426d251f0e4"

RPROVIDES:${PN} += "glib2 libglib-2.0.so.0()(64bit) libglib-2_0-0 libglib-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcre2-8.so.0()(64bit)"

inherit rpm
