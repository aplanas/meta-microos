SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-pick-2.2.0-2.1.noarch.rpm"
RPM_HASH = "42443a09f8a8769f9e8fba40d9615a1ed7660d95c710107dfeeef53e0591b9f789e6fb923ca7da32fd5b5f6aaec95f4089152a2b304a45a0554bbef501805aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pick) python311-pick python3dist(pick)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
