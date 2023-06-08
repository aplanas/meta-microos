SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-tox-no-internet-0.1.0-1.14.noarch.rpm"
RPM_HASH = "159383337ec7b2e6b1d7c1d7e64c8f5846d9038a39c5da3a0a40d4d1706fe177673a970d428f5ec832a78f8e506bff9088a38e02ab63f3e696cf733bcae87bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tox-no-internet) python39-tox-no-internet python3dist(tox-no-internet)"
RDEPENDS:${PN} += "python(abi) python39-tox"

inherit rpm
