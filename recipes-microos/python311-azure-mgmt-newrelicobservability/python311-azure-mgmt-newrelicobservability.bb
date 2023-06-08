SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-newrelicobservability-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "513879ebd5813df5f689c3d8446d5dd61755bdb5a31c87c8fcd38e104a84e911b05f97760ff0fa149fd3f8440a55522f17fc2592254a61065c2f594485e3d860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-newrelicobservability) python311-azure-mgmt-newrelicobservability python3dist(azure-mgmt-newrelicobservability)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
