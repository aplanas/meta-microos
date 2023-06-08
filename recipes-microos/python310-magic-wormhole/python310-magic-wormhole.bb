SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-magic-wormhole-0.12.0-6.4.noarch.rpm"
RPM_HASH = "328e2d389c201a7ab07717e0bba8232642d7b255943c50c4915ba4624ca0545b38207d4533231f0630acac26708bdcc153fa07ee4e7f508c25e8e78e6dbf68c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole python3.10dist(magic-wormhole) python310-magic-wormhole python3dist(magic-wormhole)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Automat python310-PyNaCl python310-click python310-hkdf python310-humanize python310-magic-wormhole-mailbox-server python310-service_identity python310-spake2 python310-tqdm python310-txtorcon update-alternatives"

inherit rpm
