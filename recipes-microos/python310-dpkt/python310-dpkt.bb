SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.7.2"

RPM_NAME = "python310-dpkt-1.9.7.2-1.8.noarch.rpm"
RPM_HASH = "3967bd176927bcfee5afc7743e890eb912710904e7046e2f998bb9dceb4a4f37557b7d496a174376b9731c334ee040ef1b1cac557e9276e502c3aab5b41a3990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dpkt python3.10dist(dpkt) python310-dpkt python3dist(dpkt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
