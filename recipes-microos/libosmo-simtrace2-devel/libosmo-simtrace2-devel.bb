SUMMARY = "Development files for the Osmocom SIMtrace2 library"
DESCRIPTION = "Osmocom SIMtrace2 (and compatible) USB device firmware.  It enables \
applications to implement SIM card / smart card tracing as well as \
SIM / smart card emulation functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-simtrace2."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-simtrace2-devel-0.8.0-1.8.aarch64.rpm"
RPM_HASH = "dc3ac7b097baf8a2fed0e718e311ed462d878765d6a187b4c92777b0add5bbd08692f8bd212a58ff98858720a94d8ca61d2df097606eb8111dc26c5619b34882"

RPROVIDES:${PN} += "libosmo-simtrace2-devel libosmo-simtrace2-devel(aarch-64) pkgconfig(libosmo-simtrace2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-simtrace2-1"

inherit rpm
