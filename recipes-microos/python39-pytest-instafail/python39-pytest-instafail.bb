SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pytest-instafail-0.5.0-1.1.noarch.rpm"
RPM_HASH = "b9aeeadbef26c1215f8b6c85000cc59bac2c2abc298141f7bb8b19162b76d88c6852305024fe3a08ac4a7f1159dc8f3bdaa9b0e7fcec8b53d2f1535a1dd2332b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-instafail) \
python39-pytest-instafail \
python3dist(pytest-instafail)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
