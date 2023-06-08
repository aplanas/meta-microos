SUMMARY = "General-Purpose Utility Library -- Library for Modules"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgmodule library provides a portable way to dynamically load \
object files (commonly known as 'plug-ins')."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "libgmodule-2_0-0-2.76.2-1.1.aarch64.rpm"
RPM_HASH = "3d12f43fa6e80eaf762a23ec3ac7c3c06981a102cc492294822b3c587f57d18ed4fbcc1e4342d380d132b92188387bfa366a4a350719dcb8d2f79a263e3a1f84"

RPROVIDES:${PN} += "libgmodule-2.0.so.0()(64bit) libgmodule-2_0-0 libgmodule-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
