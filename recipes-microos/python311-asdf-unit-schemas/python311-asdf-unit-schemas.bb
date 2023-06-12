SUMMARY = "ASDF schemas for units"
DESCRIPTION = "This package provides ASDF schemas for validating unit tags."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python311-asdf-unit-schemas-0.1.0-1.1.noarch.rpm"
RPM_HASH = "42b0847392f16fff7cf9b29bf24e70d63a11666089b6d73f38d6dd7b60f8bff537c3aedd649bc235dca6bb2dbc7a9a35c35b11a0aa55a36fdb2c3a6cf06d0199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asdf-unit-schemas) \
python311-asdf-unit-schemas \
python311-asdf_unit_schemas \
python3dist(asdf-unit-schemas)"
RDEPENDS:${PN} += "(python311-importlib_resources >= 3 if python311-base < 3.9) \
python(abi) \
python311-asdf-standard"

inherit rpm
