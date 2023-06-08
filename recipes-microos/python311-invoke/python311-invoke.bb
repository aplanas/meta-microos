SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "1.7.3"

RPM_NAME = "python311-invoke-1.7.3-2.1.noarch.rpm"
RPM_HASH = "8ed1530c1d1bc4399e822257016ffc0b4017438d3674b2b6a299361ec2ea28d41c8015b7e4104fad5455996b902201420551d961527b206cb846b4b46d1ceeeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(invoke) python311-invoke python3dist(invoke)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-fluidity-sm python311-lexicon python311-pexpect python311-six update-alternatives"

inherit rpm
