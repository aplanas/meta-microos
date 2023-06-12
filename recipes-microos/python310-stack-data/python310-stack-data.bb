SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-stack-data-0.6.2-2.1.noarch.rpm"
RPM_HASH = "a3d91a2320b23e1bd054489a7322ff6fa3c92580d05bcc05659b948eb739aaf4ade0cf02e20660957a2a3c75f58e0ae6058d33c5b24249dc3def96fb516cc879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stack-data \
python3.10dist(stack-data) \
python310-stack-data \
python3dist(stack-data)"
RDEPENDS:${PN} += "python(abi) \
python310-asttokens \
python310-executing \
python310-pure-eval"

inherit rpm
