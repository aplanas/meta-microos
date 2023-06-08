SUMMARY = "Non-ABI stable API for the Qt 6 LabsFolderListModel library"
DESCRIPTION = "This package provides private headers of libQt6LabsFolderListModel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labsfolderlistmodel-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "d98cd4a5671ddee52bf660d98d1cd77ba3b1d126f3be8234c2123afff66851d9fe8551b129edd33b227a43d6352bcc0d4fdacdfb7c8ac948cd5068feefa38bd0"

RPROVIDES:${PN} += "qt6-labsfolderlistmodel-private-devel qt6-labsfolderlistmodel-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsFolderListModel)"

inherit rpm
