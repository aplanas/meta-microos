SUMMARY = "Non-ABI stable API for the Qt 6 MultimediaWidgets Library"
DESCRIPTION = "This package provides private headers of libQt6MultimediaWidgets that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediawidgets-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "272d6aafc15388b26844b827c759fd57f2425ea93d68731ec7e8ebbadb8a2b8f12ded675d35f3c826360247f353e9ad90ca8c2e168422b1b422daf534a915862"

RPROVIDES:${PN} += "qt6-multimediawidgets-private-devel qt6-multimediawidgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6MultimediaWidgets) qt6-widgets-private-devel"

inherit rpm
