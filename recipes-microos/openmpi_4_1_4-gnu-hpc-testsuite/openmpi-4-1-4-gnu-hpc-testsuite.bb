SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi_4_1_4-gnu-hpc-testsuite-4.1.4-2.2.noarch.rpm"
RPM_HASH = "97fc7854adb6c7d7fa8fb47274dfc69279e4cfb3d10691f2e6ee7d4c663571ef56069029208114371ad559a53bef916825ebc25567f71824e41e961fc3a857f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi openmpi_4_1_4-gnu-hpc-testsuite"
RDEPENDS:${PN} += "gnu-compilers-hpc lua-lmod openmpi-runtime-config openssh"

inherit rpm
