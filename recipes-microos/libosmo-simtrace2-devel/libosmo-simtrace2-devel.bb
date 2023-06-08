SUMMARY = "Development files for the Osmocom SIMtrace2 library"
DESCRIPTION = "Osmocom SIMtrace2 (and compatible) USB device firmware.  It enables \
applications to implement SIM card / smart card tracing as well as \
SIM / smart card emulation functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-simtrace2."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-simtrace2-devel-0.8.0-1.7.aarch64.rpm"
RPM_HASH = "9e2c3f5d9b2f0bd5aa6cee1b6acd81ac05392ca993dc4d9a8ee872a29399108b1b045531cc30040318616608f070da0e31676b10edfd88d71ac9f3055aff8c10"

RPROVIDES:${PN} += "libosmo-simtrace2-devel libosmo-simtrace2-devel(aarch-64) pkgconfig(libosmo-simtrace2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-simtrace2-1"

inherit rpm
