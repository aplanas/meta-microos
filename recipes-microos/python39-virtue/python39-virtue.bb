SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python39-virtue-2.5.2-2.1.noarch.rpm"
RPM_HASH = "888a97dfe172c0a254fe82b6061ac958a3be8288dc32961f3818578b109ea643f2583ad4c1ed68815dcf287573b1b3a69cec403af28efafea6513bdd324bb15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(virtue) python39-virtue python3dist(virtue)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Twisted python39-attrs python39-click python39-colorama python39-pyrsistent update-alternatives"

inherit rpm
