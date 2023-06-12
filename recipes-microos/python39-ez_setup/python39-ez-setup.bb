SUMMARY = "Contains ez_setup.py and distribute_setup.py"
DESCRIPTION = "setup.py of several Python projects blindly import the setuptools bootstrap \
module ez_setup.py without realizing that it is usually not installed in the \
user's machine. This causes much trouble. Include ez_setup.py (and \
distribute_setup.py) as a installable Python package so users can do \
easy_install ez_setup troublesome_package as a workaround."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python39-ez_setup-0.9-3.3.noarch.rpm"
RPM_HASH = "c85c35a1f6a0aef06173d427215141eb9892bfcf31e410e79144eaf2a5f4dcdefa922427aac4754c6c927b57814bd0420d13e75dcf724c15eab6b4e807fa34dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ez-setup) \
python39-ez_setup \
python3dist(ez-setup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
