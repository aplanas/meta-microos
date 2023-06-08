SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "python311-pydbus-0.6.0-1.17.noarch.rpm"
RPM_HASH = "48d2e0afef529eacb4b2cc51f9753bbdc191ea338eb5453ee034a6691fcf65513b0227a96f79f5bfc725bf11ecc6a1b1a654d3c5f2ba120582fc988eb212d2f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydbus) python311-pydbus python3dist(pydbus)"
RDEPENDS:${PN} += "girepository-1_0 python(abi) python311-gobject"

inherit rpm
