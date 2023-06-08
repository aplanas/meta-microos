SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-devel provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-devel-4.1.4-2.2.noarch.rpm"
RPM_HASH = "b0bf7dd540ee5ae8080d78be20862223ca31eb76be076a25dfeddb71987361614071870f24683a685b378463214d2ec8ecb2dd13c2997776a3342f943abfa85b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-devel"
RDEPENDS:${PN} += "openmpi_4_1_4-gnu-hpc-devel"

inherit rpm
