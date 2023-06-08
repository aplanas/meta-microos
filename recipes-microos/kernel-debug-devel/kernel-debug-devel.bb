SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the debug flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-debug-devel-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "e9af2d04822940cf9a7d2da56dfa5915915e8a6d7b6c9dcfb2fec96b1b3245bf7ff4e535def0ab861fe7a322b9c34174f124bca0732f43ccf57cba65dee0293b"

RPROVIDES:${PN} += "kernel-debug-devel kernel-debug-devel(aarch-64) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils dwarves kernel-devel libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libelf-devel libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
