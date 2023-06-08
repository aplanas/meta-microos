SUMMARY = "Chromium vboot"
DESCRIPTION = "VBoot contains verified boot reference implementation and \
helper tools for Chrome OS devices."
LICENSE = "BSD-3-Clause"

PV = "78.12499"

RPM_NAME = "vboot-78.12499-5.4.aarch64.rpm"
RPM_HASH = "b778fc2b630dc98e4f754c7d278f5f6078ad0d94fa8a472be29c521094855f18aec4182b9f7df67d649ced504c6ed50ff927ba83ed1fb88ebf6cc83facb3dc7e"

RPROVIDES:${PN} += "vboot vboot(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
