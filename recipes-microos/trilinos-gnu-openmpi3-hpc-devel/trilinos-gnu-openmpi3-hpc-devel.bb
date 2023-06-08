SUMMARY = "Dependency package for trilinos_14_0_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-openmpi3-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi3-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-openmpi3-hpc-devel-14.0.0-1.2.noarch.rpm"
RPM_HASH = "1f5be5d12060f5c5b51095c45d86b48b79693cc430596dd6b50d27c8141fea39cd16bc121405b665f72f3d9134eb38ecaf94703abe9b52384e75afb14088120b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-openmpi3-hpc trilinos-gnu-openmpi3-hpc-devel"
RDEPENDS:${PN} += "/bin/sh trilinos_14_0_0-gnu-openmpi3-hpc-devel"

inherit rpm
