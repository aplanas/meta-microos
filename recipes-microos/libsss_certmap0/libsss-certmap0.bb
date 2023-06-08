SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_certmap0-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "9a4ee0d613630b9e485a35b647dfe2aa117525f7c326037117af1c92108a641446b4c65f12053db7c39887dadf58842eae4d8660c80ccd987357b28c69677505"

RPROVIDES:${PN} += "libsss_certmap.so.0()(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.0)(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.1)(64bit) libsss_certmap.so.0(SSS_CERTMAP_0.2)(64bit) libsss_certmap0 libsss_certmap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
