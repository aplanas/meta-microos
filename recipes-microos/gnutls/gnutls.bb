SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "gnutls-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "03103e3e27160efd09a8410abcded42ddabd20d3bc4c0352bdd629e52c1f0094f90e12c2c8d9ff994b92355813ebf3905eb3e3f9b72611d1ca9cf49574e0a1f4"

RPROVIDES:${PN} += "gnutls gnutls(aarch-64)"
RDEPENDS:${PN} += "crypto-policies ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls-dane.so.0()(64bit) libgnutls-dane.so.0(DANE_0_0)(64bit) libgnutls-dane0 libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_0)(64bit) libgnutls.so.30(GNUTLS_3_6_12)(64bit) libgnutls.so.30(GNUTLS_3_6_14)(64bit) libgnutls.so.30(GNUTLS_3_6_2)(64bit) libgnutls.so.30(GNUTLS_3_6_3)(64bit) libgnutls.so.30(GNUTLS_3_6_4)(64bit) libgnutls.so.30(GNUTLS_3_6_5)(64bit) libgnutls.so.30(GNUTLS_3_6_6)(64bit) libgnutls.so.30(GNUTLS_3_6_8)(64bit) libgnutls.so.30(GNUTLS_3_6_9)(64bit) libgnutls.so.30(GNUTLS_3_7_0)(64bit) libgnutls.so.30(GNUTLS_3_7_3)(64bit) libgnutls.so.30(GNUTLS_3_7_4)(64bit) libgnutls.so.30(GNUTLS_PRIVATE_3_4)(64bit) libjitterentropy3 libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libtasn1.so.6()(64bit) libtasn1.so.6(LIBTASN1_0_3)(64bit)"

inherit rpm
