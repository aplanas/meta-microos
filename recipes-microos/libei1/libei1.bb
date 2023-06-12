SUMMARY = "Library for emulated input in Wayland"
DESCRIPTION = "libei is a library to send Emulated Input (EI) to a matching Emulated \
Input Server (EIS) which can receive those events with libeis. \
 \
It targets Wayland and provides separation, distinction and control, \
which, for comparison, are not available with XTEST (X11's emulated \
input)."
LICENSE = "MIT"

PV = "0.99.2"

RPM_NAME = "libei1-0.99.2-1.1.aarch64.rpm"
RPM_HASH = "01fe739d9f598a4eca6080d8f2250e8cff7be7ca225ec363acde0b495b6d9da1af9376844c32955ca184b935a9517cb0aa96837f91d46adaa4a5b483643c8dd3"

RPROVIDES:${PN} += "libei.so.1()(64bit) libei1 libei1(aarch-64) libeis.so.1()(64bit) liboeffis.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_237)(64bit)"

inherit rpm
