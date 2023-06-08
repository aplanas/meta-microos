SUMMARY = "Wrappers to build Python packages using PEP 517 hooks"
DESCRIPTION = "Wrappers to build Python packages using PEP 517 hooks."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-pep517-0.13.0-3.1.noarch.rpm"
RPM_HASH = "ff43a57fc73adadef18f1e8881e34a889d4cb11ff2576475c291637ad0e8c26ec83884982c9d3448a217716a4e726d59e149fa534091360113ef77e8861d3bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep517 python3.10dist(pep517) python310-pep517 python3dist(pep517)"
RDEPENDS:${PN} += "python(abi) python310-tomli"

inherit rpm
