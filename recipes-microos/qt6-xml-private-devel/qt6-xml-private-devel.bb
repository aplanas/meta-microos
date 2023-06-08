SUMMARY = "Non-ABI stable API for the Qt 6 XML library"
DESCRIPTION = "This package provides private headers of libQt6Xml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-xml-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "f8356875d70deaa5204d3c5bc06c7433b9960f1b339b4f491d597bb4994672835e4c337ea5158e536b2312513b49ed11c18e0342513bf0f005b810ec3409cf72"

RPROVIDES:${PN} += "qt6-xml-private-devel qt6-xml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Xml) qt6-core-private-devel"

inherit rpm
