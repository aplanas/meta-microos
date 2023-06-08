SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi1-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi1-hpc-devel-6.1.0-2.8.noarch.rpm"
RPM_HASH = "3380d853199aee9e706aa3b5b4790bc73aa0deb0fd1584f7d162c4986ca31359e87bcb9383b9d6ded44c9e9f3869839d3e958bbdd6887e72e32080cfe13bbc60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi1-hpc-devel"
RDEPENDS:${PN} += "/bin/sh ptscotch_6_1_0-gnu-openmpi1-hpc-devel"

inherit rpm
