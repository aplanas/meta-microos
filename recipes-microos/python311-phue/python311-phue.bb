SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python311-phue-1.1-2.6.noarch.rpm"
RPM_HASH = "58d64c584e7b4458459e65e2ce5e1dd44073f1c94cd81b49e7aeb2b5ceca9b0dbd573e1a6fdd16aa88b10987c79fb9fb3221daace1039ca1476031090bcb0d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(phue) python311-phue python3dist(phue)"
RDEPENDS:${PN} += "/usr/bin/python3.11 python(abi)"

inherit rpm
