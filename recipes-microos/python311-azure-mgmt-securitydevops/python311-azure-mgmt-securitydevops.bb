SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-securitydevops-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "4a448d31cab22591fbf12994553560ce9e4d5d6c758f04fc90925c1103e1c84dc28d174addf79fe1a11f5bbe539f0df3549bd432d6a8d102e351891ac287eb84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-securitydevops) \
python311-azure-mgmt-securitydevops \
python3dist(azure-mgmt-securitydevops)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
