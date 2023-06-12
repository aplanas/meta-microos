SUMMARY = "Non-ABI stable API for the Qt 6 UiTools library"
DESCRIPTION = "This package provides private headers of libQt6UiTools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-uitools-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "5724a954c3abde58655ed5ef3008a7b6281debfc074a87a816dfb045957a899f212b567c0da37d6bf7bb53f0ce9d62e89b2f9a4c152b7455b4bf46cf94e712fb"

RPROVIDES:${PN} += "qt6-uitools-private-devel \
qt6-uitools-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6UiTools)"

inherit rpm
