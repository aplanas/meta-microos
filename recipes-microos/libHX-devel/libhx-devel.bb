SUMMARY = "Development for libHX, a routines collection for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more. \
 \
This subpackage contains the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12"

RPM_NAME = "libHX-devel-4.12-1.2.aarch64.rpm"
RPM_HASH = "9494d79a629f3e5912ca56618212acdde3a176a1442e028c6ba4a82d97d201eed72f930430e056cef29bb5b4eb824da7b25a716785cc5807b67bb213175b80bc"

RPROVIDES:${PN} += "libHX-devel libHX-devel(aarch-64) libHX_rtcheck.so()(64bit) libHX_rtcheck.so(LIBHX_3.25)(64bit) libHX_rtcheck.so(LIBHX_3.27)(64bit) libHX_rtcheck.so(LIBHX_4.11)(64bit) libHX_rtcheck.so(LIBHX_4.2)(64bit) libHX_rtcheck.so(LIBHX_4.3)(64bit) libHX_rtcheck.so(LIBHX_4.9)(64bit) pkgconfig(libHX)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libHX32"

inherit rpm
