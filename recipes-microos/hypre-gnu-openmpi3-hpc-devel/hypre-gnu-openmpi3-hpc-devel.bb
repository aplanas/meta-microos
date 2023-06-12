SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi3-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi3-hpc-devel-2.20.0-1.21.noarch.rpm"
RPM_HASH = "701e82f1990f6d73720fd04f58c4ad94f446d687996a70fb240d2b1c728351e93f30a4e762437763d533e20407d91a7c7e6a2a805bff52bdf1cab812729f82c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi3-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-openmpi3-hpc-devel"

inherit rpm
