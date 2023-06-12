SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libsss_certmap0-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "57275d0babcfd3c3bb185278eccbcec0ad20b37f76e2fcb25d6490af7d18dc9d3d031b6f28895d1c50fe15605df07f5ec8d0eb3ed69c30fe83a40ec43bf7f702"

RPROVIDES:${PN} += "libsss_certmap.so.0()(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.0)(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.1)(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.2)(64bit) libsss_certmap0 libsss_certmap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
