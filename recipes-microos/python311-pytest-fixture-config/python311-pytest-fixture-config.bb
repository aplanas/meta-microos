SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-fixture-config-1.7.0-3.3.noarch.rpm"
RPM_HASH = "da0bc68df04ecf78aa56edcec2ab7feff530aff623894770376722bfefd385ab84519f094fbd0561ef9b5ca4d36ba2bbc3142c6d67c9d0b93b8d36c4ee2d4c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-fixture-config) \
python311-pytest-fixture-config \
python3dist(pytest-fixture-config)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
