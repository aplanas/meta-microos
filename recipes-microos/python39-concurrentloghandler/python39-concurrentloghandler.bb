SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python39-concurrentloghandler-0.9.19-2.8.noarch.rpm"
RPM_HASH = "157043b2f12771e343afdffe0b8036b137140cce9a09663e0c765ec2fe796701ce4acb530fdacbbb3ef2335ac2ebe3c8425f313a8e06c899ed9b03b74e130e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(concurrent-log-handler) python39-concurrentloghandler python3dist(concurrent-log-handler)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
