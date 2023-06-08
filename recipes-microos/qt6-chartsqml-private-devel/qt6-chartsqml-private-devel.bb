SUMMARY = "Non-ABI stable API for the Qt 6 ChartsQml Library"
DESCRIPTION = "This package provides private headers of libQt6ChartsQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-chartsqml-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2fcf3743f2e3373abc3ebdb0a7d271d6acea79bb66f3d03548a6fd25222811781a28c556b29c030e0aedd715098fcab12577b0e7bb3f055e0d98b87712d97f4b"

RPROVIDES:${PN} += "qt6-chartsqml-private-devel qt6-chartsqml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6ChartsQml)"

inherit rpm
