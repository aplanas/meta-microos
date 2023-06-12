SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python311-pep8-naming-0.13.3-1.3.noarch.rpm"
RPM_HASH = "d0e96ebaea17f553410d46d6c9e0398747dbaf75119d389623db8fa05ecd52fc2c2e2b4132da2e813fd9bb5e47e10b6afd297fc49b0b72290aaca8e1b8a0ab38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pep8-naming) \
python311-pep8-naming \
python3dist(pep8-naming)"
RDEPENDS:${PN} += "python(abi) \
python311-flake8 \
python311-flake8-polyfill \
python311-setuptools"

inherit rpm
