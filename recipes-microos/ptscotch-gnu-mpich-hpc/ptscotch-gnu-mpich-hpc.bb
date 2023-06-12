SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-mpich-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-mpich-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-mpich-hpc-6.1.0-2.9.noarch.rpm"
RPM_HASH = "908f83664c56695133b4e2fd753f0367135012f46c1bcb19ea78a517e0dfeb618134fe8cac1fd875ae8e893172c8424a3db63a799438d2fc014720b0e21144b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-mpich-hpc"
RDEPENDS:${PN} += "/bin/sh \
ptscotch_6_1_0-gnu-mpich-hpc"

inherit rpm
