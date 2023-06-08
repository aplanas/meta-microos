SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python311-asdf-coordinates-schemas-0.1.0-1.7.noarch.rpm"
RPM_HASH = "c210224e03ec5a44292b435f0bd908f205a103e06f59c19a45d1eb686dae24c091a73d5e9113047ec9b76fe63ee887991dd381ebb5c5252db395d76e0050f4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asdf-coordinates-schemas) python311-asdf-coordinates-schemas python3dist(asdf-coordinates-schemas)"
RDEPENDS:${PN} += "python(abi) python311-asdf"

inherit rpm
