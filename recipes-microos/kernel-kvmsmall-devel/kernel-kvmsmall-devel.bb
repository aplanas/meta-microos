SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the kvmsmall flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-kvmsmall-devel-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "aa6b771ec24129c95c0cd0a058ccf384ec019e402e6c0666b0229519205ba07c458c998ce592dd422dac120e7bb626710899a0165baeaf1e8403cb95dd7cb269"

RPROVIDES:${PN} += "kernel-kvmsmall-devel kernel-kvmsmall-devel(aarch-64) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils dwarves kernel-devel libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libelf-devel libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
