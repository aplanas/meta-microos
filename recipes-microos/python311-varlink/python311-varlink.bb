SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python311-varlink-31.0.0-1.6.noarch.rpm"
RPM_HASH = "9cc86839b583ab026db02b0909f094e6c87ce90088080d94340b494354277498cf76dc699a685a5a73dce3023361877c25d00ab7c9c88e8b3062125550010371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(varlink) python311-varlink python3dist(varlink)"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python311-future"

inherit rpm
