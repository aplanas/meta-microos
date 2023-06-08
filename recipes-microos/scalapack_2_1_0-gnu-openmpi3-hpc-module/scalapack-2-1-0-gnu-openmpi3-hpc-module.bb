SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi3-hpc-module-2.1.0-9.18.aarch64.rpm"
RPM_HASH = "a327209eb1defd757020a3d26367e80215b7aca50b1f83fd469437a30e99d87842a59d1bfcf4a0874e27cc1ad2789bb0c3a0372adda8d28fa12bafe781d63df7"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-openmpi3-hpc-module scalapack_2_1_0-gnu-openmpi3-hpc-module(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
