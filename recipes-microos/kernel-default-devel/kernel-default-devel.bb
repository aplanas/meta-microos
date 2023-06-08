SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the default flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-default-devel-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "0962a62e4f238c5ff077cb013ea84f2497e29a8a6ec9bb101cd871bc4ebd49927a36671d97f842e36da1c981b5edeb06be7289d2f20c39047b31abe5cf3c4ffa"

RPROVIDES:${PN} += "kernel-default-devel kernel-default-devel(aarch-64) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils dwarves kernel-devel libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libelf-devel libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
