SUMMARY = "Dependency package for trilinos_14_0_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-openmpi4-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi4-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-openmpi4-hpc-devel-14.0.0-1.2.noarch.rpm"
RPM_HASH = "1e5e33d7e8f250c9cec744d3bf194baf8de499dca5ecbf1688906817972f1bb5cf9db90ebbe705acedb93b4f524433b7ffcfc9df277547fb9b48c11ac149d608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-openmpi4-hpc \
trilinos-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
trilinos_14_0_0-gnu-openmpi4-hpc-devel"

inherit rpm
