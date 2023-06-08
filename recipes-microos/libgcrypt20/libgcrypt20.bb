SUMMARY = "The GNU Crypto Library"
DESCRIPTION = "Libgcrypt is a general purpose crypto library based on the code used in \
GnuPG (alpha version)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.2"

RPM_NAME = "libgcrypt20-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "718206606f440144bfc6f79ccdd6efc98733e1b450ca81d240ba3e5a2970be18930c992c8b9e5358e771a4cf86950d646892e88313aa285baaeeb1a2956a3f02"

RPROVIDES:${PN} += "config(libgcrypt20) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgcrypt20 libgcrypt20(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgpg-error.so.0()(64bit) libgpg-error.so.0(GPG_ERROR_1.0)(64bit)"

inherit rpm
