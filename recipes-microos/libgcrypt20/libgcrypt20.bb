SUMMARY = "The GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose crypto library based on the code used in \
GnuPG (alpha version)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.2"

RPM_NAME = "libgcrypt20-1.10.2-2.1.aarch64.rpm"
RPM_HASH = "c74135b9cbc009c04632002894ec9ff9578421ffbc80bc7e2d6e07e20521825e3071c47a7af3c4bdc7ee797064bf04d07b51778e9c264f73d31b97fb3a7b6245"

RPROVIDES:${PN} += "config(libgcrypt20) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgcrypt20 \
libgcrypt20(aarch-64) \
libgcrypt20-hmac"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit)"

inherit rpm
