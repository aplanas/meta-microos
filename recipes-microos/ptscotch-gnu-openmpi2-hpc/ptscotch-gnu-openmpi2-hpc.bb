SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi2-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi2-hpc-6.1.0-2.8.noarch.rpm"
RPM_HASH = "55b07f41163135b1fddf66a1aa28bed78a1f3dcab751fc2963e299482030582df9dbd3bda3e38ec89d862ae06e55ae522b778b4f45ca1b3aafaef108c9f42be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi2-hpc"
RDEPENDS:${PN} += "/bin/sh ptscotch_6_1_0-gnu-openmpi2-hpc"

inherit rpm
