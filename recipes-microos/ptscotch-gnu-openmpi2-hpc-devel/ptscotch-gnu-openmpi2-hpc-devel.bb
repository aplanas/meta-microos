SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi2-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi2-hpc-devel-6.1.0-2.8.noarch.rpm"
RPM_HASH = "7e3612c1319c7656a6f0e232b15713656b7c1eb633f4405f6aa3824812e1661b41d300c2b97c12b7d89a02f5ef367c9a72408d2988a13f6f3c8eea8d37943054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi2-hpc-devel"
RDEPENDS:${PN} += "/bin/sh ptscotch_6_1_0-gnu-openmpi2-hpc-devel"

inherit rpm
