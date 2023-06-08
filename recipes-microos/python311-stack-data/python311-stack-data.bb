SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-stack-data-0.6.2-1.1.noarch.rpm"
RPM_HASH = "609091fe697bc5db1e17aea07ebdaa4111808b152dab215e06f9a58152112092c85e10e956dd0c98fb55d92311216ff647e40d4a1c5ba72180cd46ebcb5faf89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(stack-data) python311-stack-data python3dist(stack-data)"
RDEPENDS:${PN} += "python(abi) python311-asttokens python311-executing python311-pure-eval"

inherit rpm
