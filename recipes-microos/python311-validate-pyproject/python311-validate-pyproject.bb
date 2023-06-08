SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "MPL-2.0 & MIT & BSD-3-Clause"

PV = "0.9"

RPM_NAME = "python311-validate-pyproject-0.9-2.1.noarch.rpm"
RPM_HASH = "a15e11acb49beeb4af96f68e63242bbfa88449c702adfed69478f5df3d18411415b27c96d1601b2de37188cd5e241382c7521f38b6620c5c151e3d644f4b6fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(validate-pyproject) python311-validate-pyproject python311-validate_pyproject python3dist(validate-pyproject)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
