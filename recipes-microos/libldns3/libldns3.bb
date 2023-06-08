SUMMARY = "A library for developing the Domain Name System"
DESCRIPTION = "ldns is a C library that can be used for domain name system (DNS) \
development. It supports RFCs like the DNSSEC documents, and allows \
developers to create software conforming to RFCs, as well as \
experimental software for current Internet Drafts."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "libldns3-1.8.3-1.4.aarch64.rpm"
RPM_HASH = "729a15b7604ea80989caed2474ed665b776e78a24e0e9dc69ae11b598e6062383aec13e80025ebd08480e53dc55c4ae30fe37b1099b569fd96761890a28e5cd6"

RPROVIDES:${PN} += "libldns.so.3()(64bit) libldns3 libldns3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
