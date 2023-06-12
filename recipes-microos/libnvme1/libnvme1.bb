SUMMARY = "Linux-native nvme device management library"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme1-1.4-1.1.aarch64.rpm"
RPM_HASH = "f27126530014eed704a3c903cec417c7f5de829e8ea633d760b12bac94ca5a9ba483d6acb996b5ac5a6de43f1761055ce2ea9511272293c4425d64c634f8e11f"

RPROVIDES:${PN} += "libnvme.so.1()(64bit) \
libnvme.so.1(LIBNVME_1_0)(64bit) \
libnvme.so.1(LIBNVME_1_1)(64bit) \
libnvme.so.1(LIBNVME_1_2)(64bit) \
libnvme.so.1(LIBNVME_1_3)(64bit) \
libnvme.so.1(LIBNVME_1_4)(64bit) \
libnvme1 \
libnvme1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libjson-c.so.5(JSONC_PRIVATE)(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
libkeyutils.so.1(KEYUTILS_1.5)(64bit)"

inherit rpm
