SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.4.9"

RPM_NAME = "python39-pdm-2.4.9-2.1.noarch.rpm"
RPM_HASH = "48669ad35594ae150e719c5e8f3b4a4888028c76f1b8021970e404b41735b92c3a0d8a995b9406b8cf5ad10c4e76cadd3a4e7bef04220087f45ab09ae65c14a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pdm) python39-pdm python3dist(pdm)"
RDEPENDS:${PN} += "(python39-resolvelib >= 0.8 with python39-resolvelib < 0.9) (python39-tomlkit >= 0.8.0 with python39-tomlkit < 1) /bin/sh /usr/bin/python3.9 python(abi) python39-blinker python39-cachecontrol python39-certifi python39-findpython python39-installer python39-lockfile python39-packaging python39-platformdirs python39-pyproject-hooks python39-python-dotenv python39-requests-toolbelt python39-rich python39-shellingham python39-tomli python39-unearth python39-virtualenv update-alternatives"

inherit rpm
