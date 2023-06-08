SUMMARY = "Qt 6 JsonRpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 JsonRpc library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-jsonrpc-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "bf76bfd457ecbb76ea8f8f883c9d8b1e1c6654dcce14efdcf0cc545380331076280c2ec2ea5b4a17da15970c428ba5f930a51ae0daf68e1faf14704ef84fd545"

RPROVIDES:${PN} += "cmake(Qt6JsonRpcPrivate) qt6-jsonrpc-private-devel qt6-jsonrpc-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core) libQt6JsonRpc6"

inherit rpm
