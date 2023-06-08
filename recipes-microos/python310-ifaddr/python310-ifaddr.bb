SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-ifaddr-0.2.0-2.3.noarch.rpm"
RPM_HASH = "eba76ebc68e416a3e9f33e6e388b413dc25ee1d910d2d162197149829003883496444d5f3a75f7930c48f4dc77521bfa73d13c09d419384e6621e36c8bdac08d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ifaddr python3.10dist(ifaddr) python310-ifaddr python3dist(ifaddr)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
