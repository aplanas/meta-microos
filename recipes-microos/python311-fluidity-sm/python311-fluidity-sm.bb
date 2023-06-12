SUMMARY = "State machine implementation for Python objects"
DESCRIPTION = "State machine implementation for Python objects. \
 \
A Fluidity state machine must have one initial state and at least two states. \
 \
A state may have enter and exit callbacks, for running some code on state enter \
and exit, respectively. These params can be method names (as strings), \
callables, or lists of method names or callables."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-fluidity-sm-0.2.0-2.1.noarch.rpm"
RPM_HASH = "28bc9b22bb6a3449a61bdf3e6560297f8bd2746891b650767b03a349cbe22b810830525bbde8b63295da7c56d12687ab6ff37ef42f1073ada1331501590d4be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fluidity-sm) \
python311-fluidity-sm \
python3dist(fluidity-sm)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
