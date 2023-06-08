SUMMARY = "Non-ABI stable API for the Qt 6 PdfWidgets library"
DESCRIPTION = "This package provides private headers of libQt6PdfWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-pdfwidgets-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "aff6a5939d662e552718352a1f004d5c59400205e9a451281da637a2b724b7bb0ca1a8aaa5de11fe09fb4ef984578e6f834db6af9a12351596932582b0434993"

RPROVIDES:${PN} += "qt6-pdfwidgets-private-devel qt6-pdfwidgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6PdfWidgets)"

inherit rpm
