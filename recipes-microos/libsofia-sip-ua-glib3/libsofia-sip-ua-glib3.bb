SUMMARY = "A RFC3261 compliant SIP User-Agent library  (glib2 bindings)"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the glib2 bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.11+20110422"

RPM_NAME = "libsofia-sip-ua-glib3-1.12.11+20110422-1.14.aarch64.rpm"
RPM_HASH = "5b869d5e48b4d04d64226216c5781027a8b969335fe1c5626b8a03dda5df3865d1d9394b6ae1eee59271d2d37560c734ceae78df163c892138e5097f7dd45117"

RPROVIDES:${PN} += "libsofia-sip-ua-glib.so.3()(64bit) libsofia-sip-ua-glib3 libsofia-sip-ua-glib3(aarch-64) sofia-sip-glib"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libsofia-sip-ua.so.0()(64bit)"

inherit rpm
