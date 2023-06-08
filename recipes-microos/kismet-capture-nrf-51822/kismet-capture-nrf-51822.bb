SUMMARY = "Kismet nRF 51822 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 51822 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-51822-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "d041e0fe30093d5fd2824d34fd8e015ef0f883f7b85d05ab028293461eed00426051d76e0ddcbb3bddc30510e96ee18eeafef5e6d6766bc33947a37cff5b8a8c"

RPROVIDES:${PN} += "kismet-capture-nrf-51822 kismet-capture-nrf-51822(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libwebsockets.so.19()(64bit)"

inherit rpm
