SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-openmpi3-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-openmpi3-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi3-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-openmpi3-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "4a3b83d825ad5c31bc10616ed9fb890fbeea40b93c357f9de69f73427492bb89011018d94adfba337f7dde8e8081292d95015ca9055e1876c6f4c5867d764cb3"

RPROVIDES:${PN} += "libtrilinos-gnu-openmpi3-hpc libtrilinos-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libtrilinos_14_0_0-gnu-openmpi3-hpc"

inherit rpm
