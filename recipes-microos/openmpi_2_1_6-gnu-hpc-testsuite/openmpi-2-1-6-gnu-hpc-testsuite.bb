SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-testsuite-2.1.6-14.2.noarch.rpm"
RPM_HASH = "2a7711ca2d892ea33fbf6dc31a837dc0328c4a69146d84728afa03fe393b15da35579fa58d60c044ba0ed17b6a3f5a63509d567550bbad0d16ca75200f1f7fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi_2_1_6-gnu-hpc-testsuite"
RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
