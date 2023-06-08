SUMMARY = "TN3270 Access library"
DESCRIPTION = "TN3270 access library, originally designed as part of the pw3270 application. \
 \
For more details, see https://softwarepublico.gov.br/social/pw3270/ ."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "lib3270-5_4-5.4-1.10.aarch64.rpm"
RPM_HASH = "bac1175cf0f06a197f2a03ca6f9bdf73ec678cd587c6a79842889791b97659ce5691df60f9c04bea63f5f75a705fc1f23eb3e2a37a50aaf1aa6733a6675e2e4f"

RPROVIDES:${PN} += "lib3270-5_4 lib3270-5_4(aarch-64) lib3270.so.5.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
