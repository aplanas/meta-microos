SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python310-outcome-1.2.0-3.1.noarch.rpm"
RPM_HASH = "153fea99f6f937725ceb067ac9504d3f62b6081ee2ba1819e77b7c1c1b60158f33b5633a3c843dfae8916e1466de4e74ea4edd5f92f69f08a37ac2ba002031a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-outcome python3.10dist(outcome) python310-outcome python3dist(outcome)"
RDEPENDS:${PN} += "python(abi) python310-attrs"

inherit rpm
