SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-asdf-transform-schemas-0.3.0-1.3.noarch.rpm"
RPM_HASH = "1936e7d9d95a2b5eaa0738e4711cd713a245fae9992585a77af81b00dbccd5ec62fe07d0850cbdb64eb16e696514ed39eca70b268416e398a54b11223c6affdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf-transform-schemas) python39-asdf-transform-schemas python39-asdf_transform_schemas python3dist(asdf-transform-schemas)"
RDEPENDS:${PN} += "python(abi) python39-asdf-standard"

inherit rpm
