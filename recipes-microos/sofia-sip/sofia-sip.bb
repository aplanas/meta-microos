SUMMARY = "A RFC3261 compliant SIP User-Agent library"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the cli tools what ship with sofia-sip."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.11+20110422"

RPM_NAME = "sofia-sip-1.12.11+20110422-1.14.aarch64.rpm"
RPM_HASH = "7b970ddd33a412e249ebff863998bbe77bf30c997caa748af66cf492e3ebfcd2c71e609bcb6b6b3a35002bbc85c1cb4574fb9face11a2bc33c65ddb5fa76fdda"

RPROVIDES:${PN} += "sofia-sip sofia-sip(aarch-64) sofia-sip-utils"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libsofia-sip-ua.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
