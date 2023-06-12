SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-openmpi2-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-openmpi2-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-openmpi2-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "575dfa81638df55cf724bffd322af7b3f2d486e8ba5e0e4febda612f02fd5984cdbf9632b2af5f0e8919b203ef325bb92ea0a905c1957e2e7fa28e67e475a71d"

RPROVIDES:${PN} += "libtrilinos-gnu-openmpi2-hpc \
libtrilinos-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libtrilinos_14_0_0-gnu-openmpi2-hpc"

inherit rpm
