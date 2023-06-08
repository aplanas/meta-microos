SUMMARY = "Non-ABI stable API for the Qt 6 QuickTimeline Library"
DESCRIPTION = "This package provides private headers of libQt6QuickTimeline that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quicktimeline-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "74572fb965157835dd3eee1181b8eef4194e69f42f6f3f44a2020ac54998cd09c9bfbf67173e4586c766b9b804ec72147f009930cd438dcd9080f30927d1b10b"

RPROVIDES:${PN} += "qt6-quicktimeline-private-devel qt6-quicktimeline-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickTimeline)"

inherit rpm
