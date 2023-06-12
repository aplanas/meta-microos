SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.5.3"

RPM_NAME = "python311-virtue-2023.5.3-1.1.noarch.rpm"
RPM_HASH = "545ed1f62a659090e8e04f04ae2ccecbbad1a051cafa41fe83c61019e1433d939fcd66a8b0be578414d6bc84b5c05d9f0cda95d20383d82ad1a6e1b4e2081503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(virtue) python311-virtue python3dist(virtue)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Twisted python311-attrs python311-click python311-colorama python311-pyrsistent update-alternatives"

inherit rpm
