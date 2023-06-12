SUMMARY = "Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-3.89-2.1.aarch64.rpm"
RPM_HASH = "b8ea44f40c9618755461c17442b492b5d184de4141a9b15dab6b6bc0f9867a1c75398e2881947476fdb6ae2e0fb3eb3261ef00310b8c2d8e6d3c3d01f48889a1"

RPROVIDES:${PN} += "libnss3.so()(64bit) \
libnss3.so(NSS_3.10)(64bit) \
libnss3.so(NSS_3.10.2)(64bit) \
libnss3.so(NSS_3.11)(64bit) \
libnss3.so(NSS_3.11.1)(64bit) \
libnss3.so(NSS_3.11.2)(64bit) \
libnss3.so(NSS_3.11.7)(64bit) \
libnss3.so(NSS_3.11.9)(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.12.1)(64bit) \
libnss3.so(NSS_3.12.10)(64bit) \
libnss3.so(NSS_3.12.3)(64bit) \
libnss3.so(NSS_3.12.4)(64bit) \
libnss3.so(NSS_3.12.5)(64bit) \
libnss3.so(NSS_3.12.6)(64bit) \
libnss3.so(NSS_3.12.7)(64bit) \
libnss3.so(NSS_3.12.9)(64bit) \
libnss3.so(NSS_3.13)(64bit) \
libnss3.so(NSS_3.13.2)(64bit) \
libnss3.so(NSS_3.14)(64bit) \
libnss3.so(NSS_3.14.1)(64bit) \
libnss3.so(NSS_3.14.3)(64bit) \
libnss3.so(NSS_3.15)(64bit) \
libnss3.so(NSS_3.15.4)(64bit) \
libnss3.so(NSS_3.16.1)(64bit) \
libnss3.so(NSS_3.16.2)(64bit) \
libnss3.so(NSS_3.18)(64bit) \
libnss3.so(NSS_3.19)(64bit) \
libnss3.so(NSS_3.19.1)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.2.1)(64bit) \
libnss3.so(NSS_3.21)(64bit) \
libnss3.so(NSS_3.22)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.3.1)(64bit) \
libnss3.so(NSS_3.30)(64bit) \
libnss3.so(NSS_3.31)(64bit) \
libnss3.so(NSS_3.33)(64bit) \
libnss3.so(NSS_3.34)(64bit) \
libnss3.so(NSS_3.39)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.43)(64bit) \
libnss3.so(NSS_3.44)(64bit) \
libnss3.so(NSS_3.45)(64bit) \
libnss3.so(NSS_3.47)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.52)(64bit) \
libnss3.so(NSS_3.53)(64bit) \
libnss3.so(NSS_3.55)(64bit) \
libnss3.so(NSS_3.58)(64bit) \
libnss3.so(NSS_3.59)(64bit) \
libnss3.so(NSS_3.6)(64bit) \
libnss3.so(NSS_3.62)(64bit) \
libnss3.so(NSS_3.65)(64bit) \
libnss3.so(NSS_3.66)(64bit) \
libnss3.so(NSS_3.7)(64bit) \
libnss3.so(NSS_3.7.1)(64bit) \
libnss3.so(NSS_3.77)(64bit) \
libnss3.so(NSS_3.79)(64bit) \
libnss3.so(NSS_3.8)(64bit) \
libnss3.so(NSS_3.9)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libnss3.so(NSS_3.9.3)(64bit) \
libnssutil3.so()(64bit) \
libnssutil3.so(NSSUTIL_3.12)(64bit) \
libnssutil3.so(NSSUTIL_3.12.3)(64bit) \
libnssutil3.so(NSSUTIL_3.12.5)(64bit) \
libnssutil3.so(NSSUTIL_3.12.7)(64bit) \
libnssutil3.so(NSSUTIL_3.13)(64bit) \
libnssutil3.so(NSSUTIL_3.14)(64bit) \
libnssutil3.so(NSSUTIL_3.15)(64bit) \
libnssutil3.so(NSSUTIL_3.17.1)(64bit) \
libnssutil3.so(NSSUTIL_3.21)(64bit) \
libnssutil3.so(NSSUTIL_3.24)(64bit) \
libnssutil3.so(NSSUTIL_3.25)(64bit) \
libnssutil3.so(NSSUTIL_3.31)(64bit) \
libnssutil3.so(NSSUTIL_3.33)(64bit) \
libnssutil3.so(NSSUTIL_3.38)(64bit) \
libnssutil3.so(NSSUTIL_3.39)(64bit) \
libnssutil3.so(NSSUTIL_3.59)(64bit) \
libnssutil3.so(NSSUTIL_3.82)(64bit) \
libsmime3.so()(64bit) \
libsmime3.so(NSS_3.10)(64bit) \
libsmime3.so(NSS_3.12.10)(64bit) \
libsmime3.so(NSS_3.12.2)(64bit) \
libsmime3.so(NSS_3.13)(64bit) \
libsmime3.so(NSS_3.15)(64bit) \
libsmime3.so(NSS_3.16)(64bit) \
libsmime3.so(NSS_3.18)(64bit) \
libsmime3.so(NSS_3.2)(64bit) \
libsmime3.so(NSS_3.2.1)(64bit) \
libsmime3.so(NSS_3.3)(64bit) \
libsmime3.so(NSS_3.4)(64bit) \
libsmime3.so(NSS_3.4.1)(64bit) \
libsmime3.so(NSS_3.6)(64bit) \
libsmime3.so(NSS_3.7)(64bit) \
libsmime3.so(NSS_3.7.2)(64bit) \
libsmime3.so(NSS_3.8)(64bit) \
libsmime3.so(NSS_3.89)(64bit) \
libsmime3.so(NSS_3.9)(64bit) \
libsmime3.so(NSS_3.9.3)(64bit) \
libssl3.so()(64bit) \
libssl3.so(NSS_3.11.4)(64bit) \
libssl3.so(NSS_3.11.8)(64bit) \
libssl3.so(NSS_3.12.10)(64bit) \
libssl3.so(NSS_3.12.6)(64bit) \
libssl3.so(NSS_3.13)(64bit) \
libssl3.so(NSS_3.13.2)(64bit) \
libssl3.so(NSS_3.14)(64bit) \
libssl3.so(NSS_3.15)(64bit) \
libssl3.so(NSS_3.15.4)(64bit) \
libssl3.so(NSS_3.2)(64bit) \
libssl3.so(NSS_3.2.1)(64bit) \
libssl3.so(NSS_3.20)(64bit) \
libssl3.so(NSS_3.21)(64bit) \
libssl3.so(NSS_3.22)(64bit) \
libssl3.so(NSS_3.23)(64bit) \
libssl3.so(NSS_3.24)(64bit) \
libssl3.so(NSS_3.27)(64bit) \
libssl3.so(NSS_3.28)(64bit) \
libssl3.so(NSS_3.30)(64bit) \
libssl3.so(NSS_3.30.0.1)(64bit) \
libssl3.so(NSS_3.33)(64bit) \
libssl3.so(NSS_3.4)(64bit) \
libssl3.so(NSS_3.7.4)(64bit) \
libssl3.so(NSS_3.77)(64bit) \
libssl3.so(NSS_3.80)(64bit) \
mozilla-nss \
mozilla-nss(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfreebl3 \
libnspr4.so()(64bit) \
libnssckbi.so()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsoftokn3 \
mozilla-nspr"

inherit rpm
