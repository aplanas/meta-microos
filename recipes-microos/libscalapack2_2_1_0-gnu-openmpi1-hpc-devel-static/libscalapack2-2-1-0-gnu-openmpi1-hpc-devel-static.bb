SUMMARY = "Static libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi1-hpc-devel-static-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "ae4cd8c33c123c6c0655e130140f1b29ab78108b00c248e0f0e6449a02eb158bb358e5151376bbc17ec19950c7246030c4f17194ebe10df44d103e829477ad0d"

RPROVIDES:${PN} += "libscalapack2_2_1_0-gnu-openmpi1-hpc-devel-static libscalapack2_2_1_0-gnu-openmpi1-hpc-devel-static(aarch-64) scalapack_2_1_0-gnu-openmpi1-hpc-devel-static"
RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-openmpi1-hpc-devel"

inherit rpm
