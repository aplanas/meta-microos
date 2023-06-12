SUMMARY = "Qt 6 JsonRpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 JsonRpc library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-jsonrpc-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4123f23cf53296969578c545b8b99d04369034265a8ca84286d2d3f785488c10ae5c2f839994276e94035d62d2dd1e352cb47de25ec5953b56a2fd8207444e4e"

RPROVIDES:${PN} += "cmake(Qt6JsonRpcPrivate) qt6-jsonrpc-private-devel qt6-jsonrpc-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core) libQt6JsonRpc6"

inherit rpm
