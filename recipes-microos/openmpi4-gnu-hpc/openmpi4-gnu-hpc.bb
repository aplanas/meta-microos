SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc provides the dependency to get binary package openmpi_4_1_4-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "5aba40b7c9111d1e44bed44bfe885de903df7bcd43e63e325864c00e8ff7c549d0df3e7563892ead5b68bddd677e355a832b145f204e783800680bc7ebae4e3f"

RPROVIDES:${PN} += "openmpi4-gnu-hpc \
openmpi4-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
openmpi_4_1_4-gnu-hpc"

inherit rpm
