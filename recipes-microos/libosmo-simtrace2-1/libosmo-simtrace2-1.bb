SUMMARY = "Driver functions for Osmocom SIMtrace2 and compatible firmware"
DESCRIPTION = "This library contains core 'driver' functionality to interface with the \
Osmocom SIMtrace2 (and compatible) USB device firmware.  It enables \
applications to implement SIM card / smart card tracing as well as \
SIM / smart card emulation functions."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-simtrace2-1-0.8.0-1.7.aarch64.rpm"
RPM_HASH = "2a57711cbfc110dc446d5cd5c8126b1424df4256da62a9860bb62371b586e8de3e442d2d508529048e72bfafe092a2c66a842e7f22f3606099f74b2c720b5538"

RPROVIDES:${PN} += "libosmo-simtrace2-1 libosmo-simtrace2-1(aarch-64) libosmo-simtrace2.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmosim.so.2()(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
