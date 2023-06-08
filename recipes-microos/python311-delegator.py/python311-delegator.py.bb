SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-delegator.py-0.1.1-3.3.noarch.rpm"
RPM_HASH = "3742f2b5a4fe9c9992cbaef46297b8daa58518d578a90e617b9f0f48c956d2b25fe6a1c6f9cd94fa473a6ff387e6bb6761b27c5224592d3fae68587bd2bf93e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(delegator.py) python311-delegator.py python3dist(delegator.py)"
RDEPENDS:${PN} += "python(abi) python311-pexpect"

inherit rpm
