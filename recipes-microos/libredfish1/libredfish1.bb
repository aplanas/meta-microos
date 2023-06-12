SUMMARY = "Headers for building apps that use libredfish"
DESCRIPTION = "This package contains headers required to build applications that use libredfish."
LICENSE = "BSD-3-Clause"

PV = "1.3.6.4+git.a0788d4"

RPM_NAME = "libredfish1-1.3.6.4+git.a0788d4-1.2.aarch64.rpm"
RPM_HASH = "5367948eff03ba7072363208fe9ea2b757abc33d4dceffceba5e2ece30e17acf6d676e5a94356f8e25c443f5ff415853e6ebe3263dee0469bd80c3233a3d26ab"

RPROVIDES:${PN} += "libredfish.so.1()(64bit) \
libredfish1 \
libredfish1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.1.1()(64bit) \
libcrypto.so.1.1(OPENSSL_1_1_0)(64bit) \
libcurl.so.4()(64bit) \
libczmq.so.4()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libssl.so.1.1()(64bit) \
libssl.so.1.1(OPENSSL_1_1_0)(64bit)"

inherit rpm
