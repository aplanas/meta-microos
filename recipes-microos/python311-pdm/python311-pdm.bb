SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.4.9"

RPM_NAME = "python311-pdm-2.4.9-2.1.noarch.rpm"
RPM_HASH = "0e9b94f1ec49c0121e804a29fcf7e390970eea1bfde2c9e8d5380cb0e6bfcc065f6c23ee0b49f2f5977c69213b3c4ebf37f1e18c3637d12c288108a9eb8885dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pdm) \
python311-pdm \
python3dist(pdm)"
RDEPENDS:${PN} += "(python311-resolvelib >= 0.8 with python311-resolvelib < 0.9) \
(python311-tomlkit >= 0.8.0 with python311-tomlkit < 1) \
/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-blinker \
python311-cachecontrol \
python311-certifi \
python311-findpython \
python311-installer \
python311-lockfile \
python311-packaging \
python311-platformdirs \
python311-pyproject-hooks \
python311-python-dotenv \
python311-requests-toolbelt \
python311-rich \
python311-shellingham \
python311-unearth \
python311-virtualenv \
update-alternatives"

inherit rpm
