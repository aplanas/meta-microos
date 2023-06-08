SUMMARY = "Non-ABI stable API for the Qt 6 Positioning Library"
DESCRIPTION = "This package provides private headers of libQt6Positioning that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioning-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3aedc3feae17ae574d1e91f31bdcae0ff42b707974ee56fc0e290284c86867f1257cbfb886131b14c721bd93de3b73e21701bb016c3b776e5eb69e9976c550ce"

RPROVIDES:${PN} += "qt6-positioning-private-devel qt6-positioning-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Positioning)"

inherit rpm
