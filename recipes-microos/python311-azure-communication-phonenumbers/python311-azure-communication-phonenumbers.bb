SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-communication-phonenumbers-1.1.0-1.2.noarch.rpm"
RPM_HASH = "06674ab02ec88fdbcddbae782b72f64dd6ce3014411dd33e125a1b9644443b5be3ae898556db2e28e323615cef37d756d4605bab4eda8f696d9070512f5ea637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-phonenumbers) python311-azure-communication-phonenumbers python3dist(azure-communication-phonenumbers)"
RDEPENDS:${PN} += "python(abi) python311-azure-communication-nspkg python311-azure-core python311-azure-nspkg python311-msrest python311-six"

inherit rpm
