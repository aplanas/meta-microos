SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-64kb-devel-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "ae8c572d6042e0a01b5cf2cec71b378ea7dd564dfe97ce6163acb485f7c1dac464b241781b1508729894ba3c2d5acf51b4f5e43eeae33461a376f4bfb9644d2b"

RPROVIDES:${PN} += "kernel-64kb-devel kernel-64kb-devel(aarch-64) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils dwarves kernel-devel libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libelf-devel libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
