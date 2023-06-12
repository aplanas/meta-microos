SUMMARY = "Driver functions for Osmocom SIMtrace2 and compatible firmware"
DESCRIPTION = "This library contains core 'driver' functionality to interface with the \
Osmocom SIMtrace2 (and compatible) USB device firmware.  It enables \
applications to implement SIM card / smart card tracing as well as \
SIM / smart card emulation functions."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-simtrace2-1-0.8.0-1.8.aarch64.rpm"
RPM_HASH = "0fc861afe0ec9bdf61557ab73028a48b68e4053c4f74590441971a7ec7a5d23cc21f0b3420c9969ec7c6fcf5534b785067d1ff4fa00caf24ef2dcd6181be513e"

RPROVIDES:${PN} += "libosmo-simtrace2-1 \
libosmo-simtrace2-1(aarch-64) \
libosmo-simtrace2.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libosmocore.so.20()(64bit) \
libosmosim.so.2()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
