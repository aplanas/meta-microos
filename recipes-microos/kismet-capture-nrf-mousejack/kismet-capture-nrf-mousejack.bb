SUMMARY = "Kismet nRF MouseJack capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF MouseJack capture helper. \
https://kismetwireless.net/docs/readme/datasources_nrf_mousejack/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-mousejack-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "07a6b372f647f3abf7ccb40e7684c37eba4a62279a01b07b0f9a2b20d2d78cc6d6cff5ca5ef103c788916936e73cd918a0dee673be4c6f0168f5ee46d922da22"

RPROVIDES:${PN} += "kismet-capture-nrf-mousejack kismet-capture-nrf-mousejack(aarch-64)"
RDEPENDS:${PN} += "kismet ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libusb-1.0.so.0()(64bit) libwebsockets.so.19()(64bit)"

inherit rpm
