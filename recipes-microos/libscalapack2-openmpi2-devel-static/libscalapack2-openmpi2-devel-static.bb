SUMMARY = "Static libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi2-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "20b81f41d66a7981a8a021c9e5a9bf34c2b090068edd8fd5e05b4c170941d94f5a799802ae63a27afb1d120b22f8deee7cdd91925fe48478f05e0a02e46abb3e"

RPROVIDES:${PN} += "libscalapack2-openmpi2-devel-static libscalapack2-openmpi2-devel-static(aarch-64) scalapack-openmpi2-devel-static"
RDEPENDS:${PN} += "libscalapack2-openmpi2-devel"

inherit rpm
