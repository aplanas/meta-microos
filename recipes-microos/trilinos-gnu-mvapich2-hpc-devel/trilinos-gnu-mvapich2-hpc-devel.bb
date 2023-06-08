SUMMARY = "Dependency package for trilinos_14_0_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-mvapich2-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-mvapich2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-mvapich2-hpc-devel-14.0.0-1.1.noarch.rpm"
RPM_HASH = "523538a8f98acc06b04353744a4ff8e7967e05f85f27ee9ece73fbd86babc3234ca6cf055254deeccdb1f65a41b4d456fd57c0f942c5576a501c92e2f54dcf9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-mvapich2-hpc trilinos-gnu-mvapich2-hpc-devel"
RDEPENDS:${PN} += "/bin/sh trilinos_14_0_0-gnu-mvapich2-hpc-devel"

inherit rpm
