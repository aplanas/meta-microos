SUMMARY = "Python bindings for mozilla-nss and mozilla-nspr"
DESCRIPTION = "python-nss is a Python binding for NSS (Network Security Services) and \
NSPR (Netscape Portable Runtime). NSS provides cryptography services \
supporting SSL, TLS, PKI, PKIX, X509, PKCS*, etc. NSS is an \
alternative to OpenSSL and used extensively by major software \
projects. NSS is FIPS-140 certified."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python310-nss-1.0.1-4.8.aarch64.rpm"
RPM_HASH = "2a89d212e279526c3a4cc6430e437eda6970dbcec3b2e46f92ef269f4444c0e677ee2387d7ad495769a511c540d68e0e445e9ac5b209626dd393b3755d1763b2"

RPROVIDES:${PN} += "python3-nss python3.10dist(python-nss) python310-nss python310-nss(aarch-64) python3dist(python-nss)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10)(64bit) libnss3.so(NSS_3.11)(64bit) libnss3.so(NSS_3.11.1)(64bit) libnss3.so(NSS_3.11.7)(64bit) libnss3.so(NSS_3.12)(64bit) libnss3.so(NSS_3.12.5)(64bit) libnss3.so(NSS_3.12.9)(64bit) libnss3.so(NSS_3.13)(64bit) libnss3.so(NSS_3.14)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.2.1)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.5)(64bit) libnss3.so(NSS_3.6)(64bit) libnss3.so(NSS_3.7)(64bit) libnss3.so(NSS_3.8)(64bit) libnss3.so(NSS_3.9)(64bit) libnss3.so(NSS_3.9.2)(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.10)(64bit) libsmime3.so(NSS_3.2)(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.11.4)(64bit) libssl3.so(NSS_3.12.6)(64bit) libssl3.so(NSS_3.14)(64bit) libssl3.so(NSS_3.2)(64bit) libssl3.so(NSS_3.4)(64bit) libssl3.so(NSS_3.7.4)(64bit) python(abi)"

inherit rpm
