SUMMARY = "Library for emulated input in Wayland"
DESCRIPTION = "libei is a library to send Emulated Input (EI) to a matching Emulated \
Input Server (EIS) which can receive those events with libeis. \
 \
It targets Wayland and provides separation, distinction and control, \
which, for comparison, are not available with XTEST (X11's emulated \
input)."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "libei-suse4-0.5-1.1.aarch64.rpm"
RPM_HASH = "9cbc0ca8f12480f86cd2d19ea38e5b4692769039ef4ea5d3d2e241d1e594dc9cf055202765f4b9115fb03199f30e806a33d4f80ed22ea7bc1fc88966f0c93636"

RPROVIDES:${PN} += "libei-suse4 libei-suse4(aarch-64) libei.so.suse4()(64bit) libeis.so.suse4()(64bit) liboeffis.so.suse4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_237)(64bit) libsystemd.so.0(LIBSYSTEMD_241)(64bit)"

inherit rpm
