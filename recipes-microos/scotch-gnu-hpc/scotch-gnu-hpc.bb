SUMMARY = "Dependency package for scotch_6_1_0-gnu-hpc"
DESCRIPTION = "scotch: Graph, mesh and hypergraph partitioning library \
The package scotch-gnu-hpc provides the dependency to get binary package scotch_6_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of scotch_6_1_0-gnu-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-gnu-hpc-6.1.0-2.9.noarch.rpm"
RPM_HASH = "84e1c79679ebdecdc60d8414481556950f9cd75b1edc353910485d2d83500540c605d4c155ec6a2e4d440c6aab112687d8d9448e4af1c48669b437f46c02672c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scotch-gnu-hpc"
RDEPENDS:${PN} += "/bin/sh scotch_6_1_0-gnu-hpc"

inherit rpm
