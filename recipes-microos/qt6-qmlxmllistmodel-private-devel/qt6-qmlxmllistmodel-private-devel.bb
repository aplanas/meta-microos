SUMMARY = "Non-ABI stable API for the Qt 6 QmlXmlListModel library"
DESCRIPTION = "This package provides private headers of libQt6QmlXmlListModel that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlxmllistmodel-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "a264ad69fbfdb16bc0d538230821f1b545c726192811b713c583ec065613374bbd4e8f5658927aabc160ea20a9c9b0115db91ac3e4c8100d8a92b0fb3e65ec27"

RPROVIDES:${PN} += "qt6-qmlxmllistmodel-private-devel qt6-qmlxmllistmodel-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlXmlListModel) qt6-core-private-devel"

inherit rpm
