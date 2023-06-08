SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-vncdotool-1.0.0-5.4.noarch.rpm"
RPM_HASH = "5ac56844652fd06a14f44b31841dc125142a0e2a56f9c9959db8c0f1665a324fabfd591891c4ad884e746a0abc9c066435fb589d5deed6a420fe8b1ef2ccf27e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vncdotool) python39-vncdotool python3dist(vncdotool)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Pillow python39-Twisted update-alternatives"

inherit rpm
