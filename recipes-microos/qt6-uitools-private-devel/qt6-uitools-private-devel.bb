SUMMARY = "Non-ABI stable API for the Qt 6 UiTools library"
DESCRIPTION = "This package provides private headers of libQt6UiTools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-uitools-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5a124be9ae5048e914b33bdb5d17b7129f3974e3abd8f42391e1138bfcb4a01733cb659e95a230933a798885f6b0cfe0dcecd1a6b5555fee5de0d7f488136ae4"

RPROVIDES:${PN} += "qt6-uitools-private-devel qt6-uitools-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6UiTools)"

inherit rpm
