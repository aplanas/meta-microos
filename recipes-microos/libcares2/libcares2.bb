SUMMARY = "Library for asynchronous name resolves"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides the shared libraries for c-ares."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "libcares2-1.19.0-2.3.aarch64.rpm"
RPM_HASH = "527afb835ad1eba9d95f9b5721ec6944a7fa991908b2f19c5754794ad4b706e84fe7a9d2f2b4e1741e4cb15dabeb5c1ce3542f2a2350d360d434f1da59c93f8b"

RPROVIDES:${PN} += "libcares.so.2()(64bit) libcares2 libcares2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnss_usrfiles2 netcfg"

inherit rpm
