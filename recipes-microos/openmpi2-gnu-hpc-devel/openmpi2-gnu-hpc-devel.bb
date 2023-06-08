SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-devel provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-devel-2.1.6-14.3.noarch.rpm"
RPM_HASH = "d864cecddc9f8643d53775cc99871847b8ffcc7e9363e657cd89af3e6e10068993ca71908829305631dda4a7544b9255ed49c9c33af37c4f58df301b0ef4d0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-devel"
RDEPENDS:${PN} += "openmpi_2_1_6-gnu-hpc-devel"

inherit rpm
