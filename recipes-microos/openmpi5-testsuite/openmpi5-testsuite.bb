SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-testsuite-5.0.0-2.2.noarch.rpm"
RPM_HASH = "dfa68eac95ef66cd2f9d5ab099e7fd931e663fc60c4d43e99d408a5abbd65221423da569109b5fe58cc3a174a3a0d13fce5fa05b866e982a0f1a253c4b053a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi openmpi5-testsuite"
RDEPENDS:${PN} += "mpi-selector openmpi-runtime-config openmpi5-libs openssh"

inherit rpm
