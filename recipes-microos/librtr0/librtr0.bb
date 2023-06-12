SUMMARY = "Extensible RPKI-RTR-Client C library"
DESCRIPTION = "RTRlib is a C implementation of the RPKI/Router Protocol \
client. The library allows one to fetch and store validated prefix origin \
data from a RTR-cache and performs origin verification of prefixes. It \
supports different types of transport sessions (e.g., SSH, unprotected TCP) \
and is extensible."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "librtr0-0.8.0-1.8.aarch64.rpm"
RPM_HASH = "1b82fc78a73714a7b50899e29172e35d2fb643df8d43a6941105744fda2140a171c5a1ad1085e9c5c4c118024643fb4be5871c25d3ac0524969421a8d5437d60"

RPROVIDES:${PN} += "librtr.so.0()(64bit) \
librtr0 \
librtr0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit)"

inherit rpm
