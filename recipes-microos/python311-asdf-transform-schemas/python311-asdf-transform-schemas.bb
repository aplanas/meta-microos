SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-asdf-transform-schemas-0.3.0-1.3.noarch.rpm"
RPM_HASH = "2b542db126ab1b81beb00a659fc82a92265b5c50e7b79ee0b00cbbea2260a1da3a645f657e7dfba27a00893a2dabf98b5b08089daf8497e4c1d1776a98742280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asdf-transform-schemas) python311-asdf-transform-schemas python311-asdf_transform_schemas python3dist(asdf-transform-schemas)"
RDEPENDS:${PN} += "python(abi) python311-asdf-standard"

inherit rpm
