SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi1-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi1-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "859ce218f6746c9d51631e36527083f49f5833126c4a43dcca5ebe85b3a53af07837a85cf7ab8a38d712b8f980d57fcadebad24303a27d53c31fa55420d45f13"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi1-hpc libptscotch-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libptscotch_6_1_0-gnu-openmpi1-hpc"

inherit rpm
