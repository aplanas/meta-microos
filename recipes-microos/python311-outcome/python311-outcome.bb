SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python311-outcome-1.2.0-3.1.noarch.rpm"
RPM_HASH = "2fb7727060a3c13b89b8cac0c3f50c2ffd4cef073b7811b6e77fc754b366227f6683ce9575032666185b40fca36772554302b52b817b9a5f0a9ccda93d4642ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(outcome) \
python311-outcome \
python3dist(outcome)"
RDEPENDS:${PN} += "python(abi) \
python311-attrs"

inherit rpm
