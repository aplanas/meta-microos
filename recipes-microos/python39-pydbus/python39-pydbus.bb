SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "python39-pydbus-0.6.0-1.17.noarch.rpm"
RPM_HASH = "f273471937372988dbf8614fc7dc14339573a8efcbf9ca3905d57610339ae25f7d702151473b8da1b3418efba12c4eb51c7377693fb9520197add52b812b6a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydbus) python39-pydbus python3dist(pydbus)"
RDEPENDS:${PN} += "girepository-1_0 python(abi) python39-gobject"

inherit rpm
