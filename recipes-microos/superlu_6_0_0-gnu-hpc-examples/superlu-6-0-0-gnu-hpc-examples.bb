SUMMARY = "Examples for superlu_6_0_0-gnu-hpc"
DESCRIPTION = "Example programs for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu_6_0_0-gnu-hpc-examples-6.0.0-2.1.noarch.rpm"
RPM_HASH = "ddc43b722f66fdab44bba4895655b65edd735205e59fdb9b08738206f93cc79389e718c96759096e7f029967b133aa7d39890e4f22a51a182f7b30c0009da4a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu_6_0_0-gnu-hpc-examples"
RDEPENDS:${PN} += ""

inherit rpm
