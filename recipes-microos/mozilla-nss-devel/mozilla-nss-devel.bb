SUMMARY = "Network (Netscape) Security Services development files"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-devel-3.89-1.1.aarch64.rpm"
RPM_HASH = "52225b0c162dfbd1f9be38e2364184431b848c7770053fbe0017d34583d25162de39009fa162b5bb33f2910bb751451a6ffa5746a7f11d225fbff43f886110bb"

RPROVIDES:${PN} += "mozilla-nss-devel mozilla-nss-devel(aarch-64) pkgconfig(nss) pkgconfig(nss-util)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libfreebl3 libsoftokn3 mozilla-nss pkgconfig(nspr) pkgconfig(nss-util)"

inherit rpm
