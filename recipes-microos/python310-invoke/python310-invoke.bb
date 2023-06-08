SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "1.7.3"

RPM_NAME = "python310-invoke-1.7.3-2.1.noarch.rpm"
RPM_HASH = "f42f1a11e254896d5b3baf779a024ab3dce0aa83b8c01b8c423e2e6f55f2147fdbd2ac6fb458fd28bdf8c502f3dc73b456bb14954b06b653953f005921cce38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invoke python3.10dist(invoke) python310-invoke python3dist(invoke)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-fluidity-sm python310-lexicon python310-pexpect python310-six update-alternatives"

inherit rpm
