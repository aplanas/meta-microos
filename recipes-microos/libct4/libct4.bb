SUMMARY = "FreeTDS standalone driver with modern API"
DESCRIPTION = "ct-lib refers to Sybase's second-generation API, which fixes a number \
of implementation and conceptual gaps in db-lib (libsybdb). libct is \
not the most complete implementation yet."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "libct4-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "8de3151d7eb90f38945a55ac28579b74edfac286793f9d26e7bb5965256b9b1289ab6ad9bcb60b79f538303c38bdd3f502560e09d6b656d03cf068c6b36c0ce7"

RPROVIDES:${PN} += "libct.so.4()(64bit) libct4 libct4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit)"

inherit rpm
