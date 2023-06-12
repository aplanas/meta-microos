SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-openmpi3-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "a846f6e12b386cb2bfb888951bcd18c151cb341c46e561fb1244e3277d712233bdfccde48416c0e6fca5bb980c219580c3949f3662ce34c29f7fa1f3e0b7e8af"

RPROVIDES:${PN} += "petsc-openmpi3-devel \
petsc-openmpi3-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/sh \
Modules \
blacs-openmpi3-devel \
hdf5-openmpi3-devel \
hypre-openmpi3-devel \
libpetsc3_18-openmpi3 \
ptscotch-openmpi3-devel \
ptscotch-parmetis-openmpi3-devel \
scalapack-openmpi3-devel \
suitesparse-devel"

inherit rpm
