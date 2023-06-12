SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-devel-static provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-devel-static-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "7d7c3e957b27d3f4e39ff7a9c3e64dba695bf84a346384b2dab42e4ee978fd57b1ddd082b655ee78ffb3cc57f6cc2de22d84a9aaa37c12d2915b506599065452"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-devel-static \
openmpi4-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "openmpi_4_1_4-gnu-hpc-devel-static"

inherit rpm
