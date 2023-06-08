SUMMARY = "Kismet NXP KW41Z BTLE and Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the NXP KW41Z BTLE and Zigbee Sniffer capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-nxp-kw41z-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "f92eae571bd15d5f007188ef792552d3a48da59271b467a92cd533db9dceb68954226609dfdade9a5eac347d5e507b6918c31dc9e8b32a555056c72cf0a93310"

RPROVIDES:${PN} += "kismet-capture-nrf-nxp-kw41z kismet-capture-nrf-nxp-kw41z(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libwebsockets.so.19()(64bit)"

inherit rpm
