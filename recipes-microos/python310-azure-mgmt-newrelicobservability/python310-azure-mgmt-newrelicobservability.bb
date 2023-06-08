SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-newrelicobservability-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "84e42a461d436b8b894eeb428abfc4dd7c109ec52677ad2e467e915697a3249dd97e4e7edc9849bf10b527eadd945f083fc0783db77e7a6ec18541795349b0fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-newrelicobservability python3.10dist(azure-mgmt-newrelicobservability) python310-azure-mgmt-newrelicobservability python3dist(azure-mgmt-newrelicobservability)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
