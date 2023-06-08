SUMMARY = "Non-ABI stable API for the Qt 6 PdfQuick library"
DESCRIPTION = "This package provides private headers of libQt6PdfQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-pdfquick-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "d0b8ede025871c2ab767138e472d4158a891a4a76fdb9b1b0a1bed61eb0479ae9ac411f2be1171da603c29d3ce9f16ede86f259a670c43753eb909570cedc982"

RPROVIDES:${PN} += "qt6-pdfquick-private-devel qt6-pdfquick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6PdfQuick)"

inherit rpm
