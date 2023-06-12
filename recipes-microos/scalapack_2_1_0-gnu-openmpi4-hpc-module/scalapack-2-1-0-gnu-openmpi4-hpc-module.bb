SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi4-hpc-module-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "c79fbb902b1af41642ac8cf28a2a3aeb31f40a134f1e1071871d5f9183be41386fcbfb578c99d134ecb726dab7283f1c6b5d3f00befdebf6734cc668aa1ab753"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-openmpi4-hpc-module \
scalapack_2_1_0-gnu-openmpi4-hpc-module(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
