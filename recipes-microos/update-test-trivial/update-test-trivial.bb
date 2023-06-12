SUMMARY = "Package for testing the update stack during product development"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
We will provide a 'always' working update for this package so that the \
update stack could be easily tested."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-trivial-5.1-1.17.aarch64.rpm"
RPM_HASH = "d79db7e7355b0853e76c15bc5b7d428205890a1c9301d40a1ef8bd8a710356055d4ea5915eeed92b4e8778b379fe996ce773f021fea13603ba52b146de321220"

RPROVIDES:${PN} += "update-test-trivial \
update-test-trivial(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
