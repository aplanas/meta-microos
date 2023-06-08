SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-client3-0.8-23.1.aarch64.rpm"
RPM_HASH = "4c166a31fc2a2340d496f8f585dc71745a58391cf6d11e21184d7b7289bee3475af8214501449c89a378469eb3fb770ccc2c0bc941710f21c31c3b1691cf0076"

RPROVIDES:${PN} += "libavahi-client.so.3()(64bit) libavahi-client3 libavahi-client3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit)"

inherit rpm
