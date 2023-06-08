SUMMARY = "A powerful implementation of MPI"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-testsuite-1.10.7-7.3.noarch.rpm"
RPM_HASH = "3d957c62c8bd0e48e5c5ad1be58ae89d51d59824fce1a9775669bd3b6ed65f5b95ac076334e8cacee233cc933cf9d800ff726246a27232fcad265cd30b5c73fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi_1_10_7-gnu-hpc-testsuite"
RDEPENDS:${PN} += "gnu-compilers-hpc lua-lmod openmpi-runtime-config"

inherit rpm
