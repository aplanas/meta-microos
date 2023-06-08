SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-dennis-1.1.0-1.4.noarch.rpm"
RPM_HASH = "c0b9a8ffe1620caeff19a448647bf22f3b789a4aba6da75cd5ba68a98b616bc005708cde1ca108f23b7a47ba73e3dfea4ebb60a278c8b1ae1f24221ae4d0cfd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dennis) python39-dennis python3dist(dennis)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-polib update-alternatives"

inherit rpm
