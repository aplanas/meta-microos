SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "MPL-2.0 & MIT & BSD-3-Clause"

PV = "0.9"

RPM_NAME = "python310-validate-pyproject-0.9-2.1.noarch.rpm"
RPM_HASH = "0fa1419319b81920fdcd03d47f4c1374da903a27edd4a7493d723e3df3f44b104892bc967a154231f1d71391ff0b17cb2d725202d6b3a4b30e292bf2a6adb218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validate-pyproject python3-validate_pyproject python3.10dist(validate-pyproject) python310-validate-pyproject python310-validate_pyproject python3dist(validate-pyproject)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
