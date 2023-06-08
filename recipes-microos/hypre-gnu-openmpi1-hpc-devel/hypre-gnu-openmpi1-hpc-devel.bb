SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi1-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi1-hpc-devel-2.20.0-1.21.noarch.rpm"
RPM_HASH = "d3c7c8cf52119b8af8569fa95e69b792834f0b00f6a301e07155650aba2f81583570c753d979e95cbd7a570e0a41b2b058107ce8bec07f05b4a83ed18f3ef436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi1-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-openmpi1-hpc-devel"

inherit rpm
