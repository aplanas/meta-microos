SUMMARY = "Dependency package for petsc_3_18_5-gnu-openmpi4-hpc-devel"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package petsc-gnu-openmpi4-hpc-devel provides the dependency to get binary package petsc_3_18_5-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi4-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-gnu-openmpi4-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "6982488aca4035992d90462871fd2ea3e47b3b8f56f2a7a9f168cb55c6b1c9f77412193dcc4716f8d0914ab5be03f7a1d6951963ce58ffe7bbed64497575a59a"

RPROVIDES:${PN} += "petsc-gnu-openmpi4-hpc-devel petsc-gnu-openmpi4-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "petsc_3_18_5-gnu-openmpi4-hpc-devel"

inherit rpm
