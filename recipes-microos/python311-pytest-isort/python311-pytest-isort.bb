SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-pytest-isort-3.1.0-1.3.noarch.rpm"
RPM_HASH = "78026290bf05f394e7170bc3ab3e03de769b32816aad4d5382401ca1773bedef1e0bd94347c66f0e2376eb871c9c1a0504d0dd2ef46e35b3aeddcd6c253f68db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-isort) \
python311-pytest-isort \
python3dist(pytest-isort)"
RDEPENDS:${PN} += "python(abi) \
python311-isort \
python311-pytest"

inherit rpm
