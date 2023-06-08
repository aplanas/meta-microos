SUMMARY = "Documentation for superlu"
DESCRIPTION = "Documentation (HTML/PDF) for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu-doc-6.0.0-2.1.noarch.rpm"
RPM_HASH = "8a504c8994a8ac73705a141e396cdfb428b4a35afb50c23046bab24172690af9b7d024d9a0df2c6dd71c96c9d202925c2efd422e4a07afb423e929d0fa2f768a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-doc"
RDEPENDS:${PN} += ""

inherit rpm
