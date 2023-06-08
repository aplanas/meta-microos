SUMMARY = "Suite of nonlinear solvers (documentation)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the documentation files"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-doc-6.3.0-2.4.noarch.rpm"
RPM_HASH = "e8eb65b31ed97c6e888b6829b8ed0279e4fac43d97ddd6cd0a710e47a421b263bd0daec8ab4eb1096e8661481efd6ba5d93639b0d1d677f2e7bf37c9143d135a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sundials-doc"
RDEPENDS:${PN} += ""

inherit rpm
