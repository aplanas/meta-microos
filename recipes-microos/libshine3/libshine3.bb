SUMMARY = "MP3 encoding library"
DESCRIPTION = "Shine is an MP3 encoding library implemented in fixed-point \
arithmetic. The library can be used to perform MP3 encoding on \
architectures without a FPU, such as armel, etc., but likewise works \
on systems with an FPU."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libshine3-3.1.1-1.6.aarch64.rpm"
RPM_HASH = "8cd7c48a0004a27096d3aa9ffe3c235ef821010d2256320343d369696f9eca75335b63c6c5487ec07c03a8a060b3f4f6d07f6a23412878c566912c670afba545"

RPROVIDES:${PN} += "libshine.so.3()(64bit) libshine3 libshine3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
