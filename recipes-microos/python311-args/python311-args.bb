SUMMARY = "Python command argument interface"
DESCRIPTION = "This module gives developers an interface for command line argumemnts."
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python311-args-0.1.0-2.15.noarch.rpm"
RPM_HASH = "98ebbc1f5fb31df8067a612820d8bdd30108d5c0165dea8224a1e93c3bd97b21c29e9a99f0710b0b2fedc8781dcb742dd2906ebd653d02c7f91e6d0c77d6f5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(args) python311-args python3dist(args)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
