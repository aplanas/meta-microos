SUMMARY = "Header files for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-devel-0.8-23.1.aarch64.rpm"
RPM_HASH = "adcb8940904f032d85044f01013a81bf6cf3e9363ce3e14d16f80af48dfbbf8e55286bae1d35d39cb6798c16094de1909b11199399dccc08a6a609ee9590979c"

RPROVIDES:${PN} += "avahi-devel \
libavahi-devel \
libavahi-devel(aarch-64) \
pkgconfig(avahi-client) \
pkgconfig(avahi-core) \
pkgconfig(avahi-libevent)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
glibc-devel \
libavahi-client3 \
libavahi-common3 \
libavahi-core7 \
libavahi-libevent1 \
pkgconfig(libevent)"

inherit rpm
