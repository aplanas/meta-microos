SUMMARY = "Non-ABI stable API for the Qt 6 tools libraries"
DESCRIPTION = "This package provides private headers of qt6-tools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-tools-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ef1673dd534bc6166f95348a4e2588b15a1749a32739432725ab9d1e61aecf7791c92e5b8a4d2d69d5d6ffc893aa0dd3abcf7eb1d2ab9f89d86c5223d3cd837a"

RPROVIDES:${PN} += "qt6-tools-private-devel qt6-tools-private-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
