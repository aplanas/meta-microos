SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-vanilla-devel-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "7db027b866f2ab2bbda9877a00baefbf31a754bdf2a032c9872a7a5b13ff55f3cb083a23e6e95edba25c6cff3d758419f9984cb9f057e46387073201856e8f70"

RPROVIDES:${PN} += "kernel-vanilla-devel kernel-vanilla-devel(aarch-64) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils dwarves kernel-source-vanilla libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
