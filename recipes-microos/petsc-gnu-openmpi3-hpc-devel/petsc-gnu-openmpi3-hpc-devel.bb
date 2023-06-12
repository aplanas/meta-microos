SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi3-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi3-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi3-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi3-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "938505717e0cd33c635ff2bab8f285592f3697df17efeddf1b542d13800b935f68828b1da9458974708cf1aed43a048393e83858b971180af59e794093780a53"

RPROVIDES:${PN} += "petsc-gnu-openmpi3-hpc-devel \
petsc-gnu-openmpi3-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "petsc_3_18_5-gnu-openmpi3-hpc-devel"

inherit rpm
