SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "lua53-luasec-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "5ea542a7f2f731c1b433b2abb160554f9700f07ad45b1998cfec3efebed48783e500776116c46baf4d9d52b719c18252a5bbe9a4acf09a30cbf03f3ec4e82d43"

RPROVIDES:${PN} += "lua53-luasec \
lua53-luasec(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
lua53 \
lua53-luasocket"

inherit rpm
