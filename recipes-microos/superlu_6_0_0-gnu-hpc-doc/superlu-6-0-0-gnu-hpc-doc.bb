SUMMARY = "Documentation for superlu_6_0_0-gnu-hpc"
DESCRIPTION = "Documentation (HTML/PDF) for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu_6_0_0-gnu-hpc-doc-6.0.0-2.1.noarch.rpm"
RPM_HASH = "59ac9ed7ceb058a69e8c36384b19f3756b51609727ca7c5dc33d3ae47b4cb705bc469538bec10e58366ae8eac87d8029aec743ff54f337b0baa42f47b6e48931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu_6_0_0-gnu-hpc-doc"
RDEPENDS:${PN} += ""

inherit rpm
