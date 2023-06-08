SUMMARY = "Network Security Services Softoken Module"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards. \
 \
Network Security Services Softoken Cryptographic Module"
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "libsoftokn3-3.89-1.1.aarch64.rpm"
RPM_HASH = "e281c458099f2745bb46bc49dd3654b5f40824b31b245d7089e9efacf0b0da57bed2849409c65621a2bba5c03b5cff139bed16bb5ce722d095dd281105f6fe42"

RPROVIDES:${PN} += "libnssdbm3.so()(64bit) libnssdbm3.so(NSSDBM_3.12)(64bit) libsoftokn3 libsoftokn3(aarch-64) libsoftokn3.so()(64bit) libsoftokn3.so(NSS_3.4)(64bit) libsoftokn3.so(NSS_3.52)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreebl3 libnspr4.so()(64bit) libnssutil3.so()(64bit) libnssutil3.so(NSSUTIL_3.12)(64bit) libnssutil3.so(NSSUTIL_3.12.3)(64bit) libnssutil3.so(NSSUTIL_3.12.5)(64bit) libnssutil3.so(NSSUTIL_3.14)(64bit) libnssutil3.so(NSSUTIL_3.17.1)(64bit) libnssutil3.so(NSSUTIL_3.24)(64bit) libplc4.so()(64bit) libplds4.so()(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
