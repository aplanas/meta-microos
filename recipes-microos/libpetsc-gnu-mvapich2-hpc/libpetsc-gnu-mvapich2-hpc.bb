SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-mvapich2-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-mvapich2-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mvapich2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-mvapich2-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "d88935a09eb9940370720ccc4f3d1f887ded0e4804c1713fa27bf33771e39f6848e66b2bf0558f6f2950cab69a1bce3f6336207240c9f77546c9976b8a929fe7"

RPROVIDES:${PN} += "libpetsc-gnu-mvapich2-hpc libpetsc-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libpetsc_3_18_5-gnu-mvapich2-hpc"

inherit rpm
