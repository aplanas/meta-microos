SUMMARY = "Module files for scalapack_2_1_0-gnu-mpich-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mpich-hpc-module-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "6d1978f69616d6d46581e12af0e5b8ef604c0a0efa306c5444d9d0ac66f209487119843fb3ea9f12b34b67cac9f4a573932f90b21d6283c31368a5b8b3d18f2f"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-mpich-hpc-module scalapack_2_1_0-gnu-mpich-hpc-module(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
