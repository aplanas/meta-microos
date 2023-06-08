SUMMARY = "Library providing CPU identification for x86"
DESCRIPTION = "Libcpuid provides CPU identification for the x86 (and x86_64) \
architectures."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "libcpuid16-0.6.3-1.1.aarch64.rpm"
RPM_HASH = "22a57a26075e0d658bbc352c31de9525d489ed8b8f91f0c81c53fa78c170afaece1a540ed7cbbdf875f18ce594b7fef67036f52617f3fa4711ccabff74771edd"

RPROVIDES:${PN} += "libcpuid.so.16()(64bit) libcpuid16 libcpuid16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
