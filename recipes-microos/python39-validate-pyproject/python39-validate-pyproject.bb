SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "MPL-2.0 & MIT & BSD-3-Clause"

PV = "0.9"

RPM_NAME = "python39-validate-pyproject-0.9-2.1.noarch.rpm"
RPM_HASH = "7dd35da2e3c66001e432978f37a5f1275f0a29402c3becbf7e717639951ef71c46a7be8e045c79116cca23650631982c8d3d9f12f1ebd499f12d324b95d81b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(validate-pyproject) python39-validate-pyproject python39-validate_pyproject python3dist(validate-pyproject)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
