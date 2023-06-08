SUMMARY = "Kismet nRF 52840 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 52840 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-52840-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "1e47b4c4e08baf7542f760ad3ae022b6cc262adb742490d05c73efe8dfe357607e9ff6ff40ac6f739f68e2590734bc316ca433a0221c43dc877eb452d1d5a33a"

RPROVIDES:${PN} += "kismet-capture-nrf-52840 kismet-capture-nrf-52840(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libwebsockets.so.19()(64bit)"

inherit rpm
