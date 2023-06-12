SUMMARY = "Non-ABI stable API for the Qt 6 LabsFolderListModel library"
DESCRIPTION = "This package provides private headers of libQt6LabsFolderListModel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsfolderlistmodel-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "5aeb2eb562d96396c6f977c807044d08fa2218f912d81ba4589ee621389c1923ef461d9228c8ab447fa3aee5702e1515cb0f82e1ec65b42e1f929f055ed51fcc"

RPROVIDES:${PN} += "qt6-labsfolderlistmodel-private-devel qt6-labsfolderlistmodel-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsFolderListModel)"

inherit rpm
