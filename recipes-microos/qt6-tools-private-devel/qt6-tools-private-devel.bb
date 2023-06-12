SUMMARY = "Non-ABI stable API for the Qt 6 tools libraries"
DESCRIPTION = "This package provides private headers of qt6-tools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1af2c6c09d0d8f297780d988a722e381086a7dda85f450cbf4cb9da99632577be085f666535f971a1e0d6cbc223793e8674b69682dd3752b1bb9187f67b59e3c"

RPROVIDES:${PN} += "qt6-tools-private-devel \
qt6-tools-private-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
