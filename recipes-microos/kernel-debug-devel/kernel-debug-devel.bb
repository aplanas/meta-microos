SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the debug flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-debug-devel-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "7d906cb4b0799aa1aa45f97b8374adb6d3e63fb814c0651b632500c36bbeddab3c3c8b89702d9af376a0acbdde58dae5e715a5bb1ae93cee2cf456655e4175b0"

RPROVIDES:${PN} += "kernel-debug-devel kernel-debug-devel(aarch-64) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils dwarves kernel-devel libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libelf-devel libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
