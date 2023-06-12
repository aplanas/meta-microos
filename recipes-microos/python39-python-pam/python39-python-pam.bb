SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "python39-python-pam-1.8.4-1.15.noarch.rpm"
RPM_HASH = "d851b08e350dbef2040fb8e9320dc25aa9d85517173b1f597c7b0e6aee5e93e6df7b940d541ddf58e7fe2d96a9f332bc6187f75b3b0220d12176e7fa76f26e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-pam) \
python39-python-pam \
python3dist(python-pam)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
