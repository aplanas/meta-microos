SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-openmpi4-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "c084f79734c95ac755e817167f72719230b4d67f17281f139d832d0f9a0552ae299f291da32a7341bf602b1dceb0dd0628ea2eaff4b4b0d86b6c061de87eaa8e"

RPROVIDES:${PN} += "petsc-openmpi4-devel petsc-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/sh Modules blacs-openmpi4-devel hdf5-openmpi4-devel hypre-openmpi4-devel libpetsc3_18-openmpi4 ptscotch-openmpi4-devel ptscotch-parmetis-openmpi4-devel scalapack-openmpi4-devel suitesparse-devel"

inherit rpm
