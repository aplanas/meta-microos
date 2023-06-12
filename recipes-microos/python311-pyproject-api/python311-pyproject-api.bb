SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-pyproject-api-1.5.1-1.1.noarch.rpm"
RPM_HASH = "7f552c3e933d40c92bd0e8fb529bc24f1456e176e112b5ba958f7dcbc654cf499afb8064885efe49af68ac4c0699fb3d957a42c4c57a19776942b420a9c1cdcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyproject-api) \
python311-pyproject-api \
python3dist(pyproject-api)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 6 if python3-base < 3.8) \
(python311-tomli >= 2.0.1 if python3-base < 3.11) \
python(abi) \
python311-packaging"

inherit rpm
