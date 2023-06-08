SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-pick-2.2.0-1.4.noarch.rpm"
RPM_HASH = "cc38f24bda3b11113e467d5fae9440699891b820ef2c0c368a27e9b0c510a0e692fa40cd39723e93a4a8f7281eb78402f32e63c7bf47c203ee9cfb19ffe9ea97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pick) python39-pick python3dist(pick)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
