SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-hvac-1.1.0-1.2.noarch.rpm"
RPM_HASH = "6c0f4780993ed659de45a0d7e02dfd7c8b3f2464b6b8d03617a3e910c157de535acc6080a4e54f37a48af9ab3bdc65f7a120b3bdf9f46c35b472206417088f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hvac) \
python311-hvac \
python3dist(hvac)"
RDEPENDS:${PN} += "python(abi) \
python311-pyhcl \
python311-requests"

inherit rpm
