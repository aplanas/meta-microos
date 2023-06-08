SUMMARY = "Static libraries for ScaLAPACK (mpich)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mpich-hpc-devel-static-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "058f4c4ad380a38f70875c9ac9a99b5ba7746a4cd9321ee5c1ae40c8b4ee4be268bd740e56e9dd4d340ebba5fbd8c25e08daefc408429d9f8e19db96bcbe2113"

RPROVIDES:${PN} += "libscalapack2_2_1_0-gnu-mpich-hpc-devel-static libscalapack2_2_1_0-gnu-mpich-hpc-devel-static(aarch-64) scalapack_2_1_0-gnu-mpich-hpc-devel-static"
RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-mpich-hpc-devel"

inherit rpm
