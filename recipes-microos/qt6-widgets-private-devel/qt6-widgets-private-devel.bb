SUMMARY = "Non-ABI stable API for the Qt 6 Widgets library"
DESCRIPTION = "This package provides private headers of libQt6Widgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-widgets-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "65c1acd2156aab8ce866f8ec590fbed5ec5827794627b7f1cd7ef7d819ae2a8cced1c243b685d8a7fb417213312fc810379dbc3e5444fe5578bd61936c5916b2"

RPROVIDES:${PN} += "qt6-widgets-private-devel qt6-widgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Widgets) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
