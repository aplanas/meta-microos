SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi1-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi1-hpc-6.1.0-2.8.noarch.rpm"
RPM_HASH = "f2981001b607d78263e6b03b8ef82691602eda90d582ee9918d6490f1b01cbd50a2b39ab6e704c4b141c1a959a29aeb6d5b14180441fa7f6fea7c89d4c97b55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi1-hpc"
RDEPENDS:${PN} += "/bin/sh ptscotch_6_1_0-gnu-openmpi1-hpc"

inherit rpm
