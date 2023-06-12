SUMMARY = "Non-ABI stable API for the Qt 6 PdfWidgets library"
DESCRIPTION = "This package provides private headers of libQt6PdfWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfwidgets-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "add8afb0ef277196f371f612d54c1796ca15162c368a08a5ffb38431176a62116b97473185424472e8e08f95efd55046b841667a01f8c5ef86d8e9f0cb28bbf7"

RPROVIDES:${PN} += "qt6-pdfwidgets-private-devel qt6-pdfwidgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6PdfWidgets)"

inherit rpm
