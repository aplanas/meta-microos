SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-newrelicobservability-1.0.0-1.1.noarch.rpm"
RPM_HASH = "b38de9853020dabb618e448e5a17c24018536b3d3c0c908eb93802c9ca8ad3dc49e7a1fa937748e81a39b8af9f800def179246d03f3456ed518a402001c85af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-newrelicobservability) \
python311-azure-mgmt-newrelicobservability \
python3dist(azure-mgmt-newrelicobservability)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
