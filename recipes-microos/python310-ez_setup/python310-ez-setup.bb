SUMMARY = "Contains ez_setup.py and distribute_setup.py"
DESCRIPTION = "setup.py of several Python projects blindly import the setuptools bootstrap \
module ez_setup.py without realizing that it is usually not installed in the \
user's machine. This causes much trouble. Include ez_setup.py (and \
distribute_setup.py) as a installable Python package so users can do \
easy_install ez_setup troublesome_package as a workaround."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python310-ez_setup-0.9-3.3.noarch.rpm"
RPM_HASH = "1c2ef41573e04e96e261ed6e88bf9e44ae68fc537ba7d92b6952d33b180973d1434aa97b1baefe63a7526c65a08cdbc6136cbdd6d7a21f05619240af52eda925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ez_setup python3.10dist(ez-setup) python310-ez_setup python3dist(ez-setup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
