SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi2-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi2-hpc-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "b4628a5dd6b24b551d499bdc25f02466cfc73874c1b957ca4649267662dae2f5e1e5e30e25b6733e1cc553913fbde73411b3a985e4b608eda232db626f3f06eb"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi2-hpc libscalapack2-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libscalapack2_2_1_0-gnu-openmpi2-hpc"

inherit rpm
