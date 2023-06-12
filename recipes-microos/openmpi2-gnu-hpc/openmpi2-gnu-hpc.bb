SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc provides the dependency to get binary package openmpi_2_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "760bad56702c680f3d99806f6a2e2b75d15e9ec62a35654f35895c66f726d02ff2b066bdfe869c0310a35cd60c31f93f12c707ff8c23caf7cec6e1dfc0ddec8c"

RPROVIDES:${PN} += "openmpi2-gnu-hpc \
openmpi2-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
openmpi_2_1_6-gnu-hpc"

inherit rpm
