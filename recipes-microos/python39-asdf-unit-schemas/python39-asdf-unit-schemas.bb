SUMMARY = "ASDF schemas for units"
DESCRIPTION = "This package provides ASDF schemas for validating unit tags."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python39-asdf-unit-schemas-0.1.0-1.1.noarch.rpm"
RPM_HASH = "116afc00c2f87bf0e8ea68b2f41545d46609e0a39b937a8ca66d49ab8c71ceac66f0092ddd42c2ae8bcf427d32da182b430ed5e3fe7d1e605307a41c70f78532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf-unit-schemas) \
python39-asdf-unit-schemas \
python39-asdf_unit_schemas \
python3dist(asdf-unit-schemas)"
RDEPENDS:${PN} += "(python39-importlib_resources >= 3 if python39-base < 3.9) \
python(abi) \
python39-asdf-standard"

inherit rpm
