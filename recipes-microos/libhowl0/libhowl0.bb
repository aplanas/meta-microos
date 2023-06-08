SUMMARY = "Howl Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Howl compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libhowl0-0.8-23.1.aarch64.rpm"
RPM_HASH = "bd9d90078225524db6e0c105a787b060dd15312895114e1d335a8c48b5d2d8dc5b0b9e5d1df9f9b6ed5a13a8254217e9e996465822dad8a3784b3b733a9ce996"

RPROVIDES:${PN} += "avahi-compat-howl libhowl.so.0()(64bit) libhowl0 libhowl0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
