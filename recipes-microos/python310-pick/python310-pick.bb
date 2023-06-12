SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-pick-2.2.0-2.1.noarch.rpm"
RPM_HASH = "60ae06ac0a727864836d6630664495b9bb4d22efa1a8e6cf3f2e37ded3718fcb713078741d7709b2c0702f68a5f3d3d5e53b0d69f25e9752bac6b27c9b57bbd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pick python3.10dist(pick) python310-pick python3dist(pick)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
