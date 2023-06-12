SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.13"

RPM_NAME = "python310-validate-pyproject-0.13-1.1.noarch.rpm"
RPM_HASH = "f9138e0a2ebfdbeaa68941e83f613eac5482648b5856eb7c1fc3d8550bf9a59bff4e1154be19b0f545d40af8ef95faba47ff866bd44177043ef18dd9c1d0f1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validate-pyproject python3-validate_pyproject python3.10dist(validate-pyproject) python310-validate-pyproject python310-validate_pyproject python3dist(validate-pyproject)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-fastjsonschema update-alternatives"

inherit rpm
