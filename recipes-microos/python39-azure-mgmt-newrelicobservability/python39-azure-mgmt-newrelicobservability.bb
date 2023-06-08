SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-newrelicobservability-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "0e6512c005f245df6a52db9a4c3d674a7eeae62c6ff7d667ec70ea20cd53ee23bf3d43dbba86f13df41e0636b3bc008a336280dd8bb3668f8e58899cc0fcdec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-newrelicobservability) python39-azure-mgmt-newrelicobservability python3dist(azure-mgmt-newrelicobservability)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
