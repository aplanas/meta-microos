SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python311-retry-0.9.2-3.6.noarch.rpm"
RPM_HASH = "1cf5411cdd75169642f28d245df2a8431f410bb6dffa794a2b218011cc82d8da28f56902ec8e5050b258be2f3ce48ddb347d38457264beba23ba8ac815ba57eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(retry) python311-retry python3dist(retry)"
RDEPENDS:${PN} += "python(abi) python311-decorator python311-py"

inherit rpm
