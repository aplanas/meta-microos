SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-certs-3.89-1.1.aarch64.rpm"
RPM_HASH = "f0422bd915f2d913b315f2a306104459fdce7ea5423860d582eab840caf2ce313fa6fb48c86e5babaf1681d942efc3b4f7c1d8603ab8c400d0a0564c31f965f4"

RPROVIDES:${PN} += "libnssckbi.so()(64bit) libnssckbi.so(NSS_3.1)(64bit) mozilla-nss-certs mozilla-nss-certs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnspr4.so()(64bit) libplc4.so()(64bit) libplds4.so()(64bit)"

inherit rpm
