SUMMARY = "Development files for GF(2) arithmetic with libm4ri"
DESCRIPTION = "M4RI is a library for arithmetic with dense matrices over the \
Galois Field GF(2). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libm4ri."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4ri-devel-20200125-1.3.aarch64.rpm"
RPM_HASH = "43c8ea5d3a62f41d620a2725031777150adf1d40333e8922ee3628433ad5d55530b1c04c1b27e5d7e7f2a94c8646ddebce9bf1f8a7a09d0812e6c38e9af270b4"

RPROVIDES:${PN} += "libm4ri-devel libm4ri-devel(aarch-64) pkgconfig(m4ri)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libm4ri-0_0_20200125 pkgconfig(libpng)"

inherit rpm
