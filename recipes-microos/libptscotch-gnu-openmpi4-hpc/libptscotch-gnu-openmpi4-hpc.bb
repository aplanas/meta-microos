SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi4-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi4-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "b5a2f6ce8a4c8f63f6f22bf31010e05d142f2e99a103da7f20f423468fc0cb4e799d50ed963b52919bf853d00942e3416d300dfdf01c2d161474030400749860"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi4-hpc libptscotch-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libptscotch_6_1_0-gnu-openmpi4-hpc"

inherit rpm
