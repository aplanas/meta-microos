SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-testsuite-4.1.4-2.2.noarch.rpm"
RPM_HASH = "062332bf180c2eaa48ec549acf041e751630e0cbb9fac8ee5e136b2f2a5b2b19b14a45bd01b4f9d1ae2d53a506a94b63b6eda0fb442149a24bfca2cf39c15410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi4-testsuite"
RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi4-libs \
openssh"

inherit rpm
