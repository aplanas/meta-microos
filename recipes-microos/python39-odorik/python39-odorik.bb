SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python39-odorik-0.5-6.4.noarch.rpm"
RPM_HASH = "d021bf908f417c6e752e1d5158a0990da2e7f569f5977088c8decaf922a06f7b7412b26d46f30f3d90f201dd93200c702d56a75580f40e681e24fdf6cc03974b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(odorik) python39-odorik python3dist(odorik)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-python-dateutil python39-xdg update-alternatives"

inherit rpm
