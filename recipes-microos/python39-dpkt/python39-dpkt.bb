SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.7.2"

RPM_NAME = "python39-dpkt-1.9.7.2-1.8.noarch.rpm"
RPM_HASH = "b471caeaa37c09f12b805eca53d38e3960dbfe3ea25ad0627dabe7b4bdae8a9ccda0f5c6d7dad4e1cf9683d9efe0c9cdb94b03f0b2133d033b73097964b752ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dpkt) python39-dpkt python3dist(dpkt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
