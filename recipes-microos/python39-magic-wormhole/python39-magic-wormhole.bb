SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-magic-wormhole-0.12.0-6.4.noarch.rpm"
RPM_HASH = "28e1d149d5cfecc9f4906b09cf9b98f312448d607f6f425474f971d31338704abcefd9a3341ab6dc81fd6e118c80ce9f74d95a16c5bff3467cb81a8dc7f3f7e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(magic-wormhole) python39-magic-wormhole python3dist(magic-wormhole)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Automat python39-PyNaCl python39-click python39-hkdf python39-humanize python39-magic-wormhole-mailbox-server python39-service_identity python39-spake2 python39-tqdm python39-txtorcon update-alternatives"

inherit rpm
