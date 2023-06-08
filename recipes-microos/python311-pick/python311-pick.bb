SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-pick-2.2.0-1.4.noarch.rpm"
RPM_HASH = "4efdcef8d910aaac940c6e8a7b4fd9c75164189323290ff8501fe84c8c54d072003e4046d3ce8ca851a21dbb67e1a5913b483787e3fa5dc22a6ca41f13b3b348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pick) python311-pick python3dist(pick)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
