SUMMARY = "GLib test harness and mocking framework"
DESCRIPTION = "libglib-testing is a test library providing test harnesses and mock \
classes which complement the classes provided by GLib. It is \
intended to be used by any project which uses GLib and which wants \
to write internal unit tests."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libglib-testing-0-0-0.1.1-1.4.aarch64.rpm"
RPM_HASH = "f6caaa3e92abf6c16896165336e63bf0bbfdff87554d9c1bcbd27744d2a25f095fc27e0c7bfdacfb9edaaebc79c17b04b6d05a833ee17ab7faea1b2b59d5c8d0"

RPROVIDES:${PN} += "libglib-testing-0-0 libglib-testing-0-0(aarch-64) libglib-testing-0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
