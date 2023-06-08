SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the kvmsmall flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-kvmsmall-devel-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "7f85a8cb5279c9b974672a974cf2d10f718678c6027e132de83a01f3b978c1a0fd022382b73aadbb720c51f141f81969b014432e4a58b9bfcb01ae2d36377c86"

RPROVIDES:${PN} += "kernel-kvmsmall-devel kernel-kvmsmall-devel(aarch-64) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils dwarves kernel-devel libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libelf-devel libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
