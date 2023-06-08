SUMMARY = "Non-ABI stable API for the Qt 6 MultimediaWidgets Library"
DESCRIPTION = "This package provides private headers of libQt6MultimediaWidgets that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimediawidgets-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "890285ddd50d441511fbfaea3f058619703264b2354d83710f3b315b2b9d443338b8a81232cb2fcfcb170ca9e10dd3e2c6413ff11d9f50621623c21d95794084"

RPROVIDES:${PN} += "qt6-multimediawidgets-private-devel qt6-multimediawidgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6MultimediaWidgets) qt6-widgets-private-devel"

inherit rpm
