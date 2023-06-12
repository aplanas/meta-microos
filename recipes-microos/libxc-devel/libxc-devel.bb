SUMMARY = "Development files for libxc"
DESCRIPTION = "Libxc is a library of exchange and correlation functionals. Its \
purpose is to be used in codes that implement density-functional \
theory. The library includes most of the local density \
approximations (LDAs), generalized density approximation (GGAs), and \
meta-GGAs. The library provides values for the energy density and its \
1st, 2nd, and (for the LDAs) 3rd derivatives. \
 \
This package contains development headers and libraries for libxc."
LICENSE = "MPL-2.0"

PV = "6.2.0"

RPM_NAME = "libxc-devel-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "117f5e347a84ada1b2ae51b74486af5a8057bfd2776777286511aa5f06155142ccdc6fef188407c3a8f7d8b7d1d2f9029b35ba6b474917cb070e1e1ba5b25ffd"

RPROVIDES:${PN} += "libxc-devel \
libxc-devel(aarch-64) \
pkgconfig(libxc) \
pkgconfig(libxcf03) \
pkgconfig(libxcf90)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxc.so.12()(64bit) \
libxc12"

inherit rpm
