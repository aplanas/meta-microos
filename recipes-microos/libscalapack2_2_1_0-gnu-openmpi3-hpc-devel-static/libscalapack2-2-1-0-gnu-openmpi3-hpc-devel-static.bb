SUMMARY = "Static libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi3-hpc-devel-static-2.1.0-9.18.aarch64.rpm"
RPM_HASH = "9e5cc0421776566d2badbbfa637a6432cd2d2bc643d558d5d18f4fe470ea7982efa2e67fe0973dbbad650f12834ac68667ff72a7581fc9efafef5a94a8921279"

RPROVIDES:${PN} += "libscalapack2_2_1_0-gnu-openmpi3-hpc-devel-static \
libscalapack2_2_1_0-gnu-openmpi3-hpc-devel-static(aarch-64) \
scalapack_2_1_0-gnu-openmpi3-hpc-devel-static"
RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-openmpi3-hpc-devel"

inherit rpm
