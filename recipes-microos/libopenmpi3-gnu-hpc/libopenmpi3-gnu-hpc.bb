SUMMARY = "Dependency package for libopenmpi_3_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package libopenmpi3-gnu-hpc provides the dependency to get binary package libopenmpi_3_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "libopenmpi3-gnu-hpc-3.1.6-7.2.aarch64.rpm"
RPM_HASH = "2789b8d2506b9cdaabe124e23b6be592ac2037005b84db857615f9a8472b02c97558921738088de838b77f58f8192f167f06c3a8c8191434681cef91fb41e35c"

RPROVIDES:${PN} += "libopenmpi3-gnu-hpc libopenmpi3-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "libopenmpi_3_1_6-gnu-hpc"

inherit rpm
