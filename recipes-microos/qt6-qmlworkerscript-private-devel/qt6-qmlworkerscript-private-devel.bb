SUMMARY = "Non-ABI stable API for the Qt 6 QmlWorkerScript library"
DESCRIPTION = "This package provides private headers of libQt6QmlWorkerScript that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlworkerscript-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "2bad21cff87e40a6e4a109b6ebf9954a77e81dd7edd14cbe27be451fe7b121707b7be3a43dc3f03346066bca3e6a6824870ad3a3f7b2834085a6ad74829f9cc5"

RPROVIDES:${PN} += "qt6-qmlworkerscript-private-devel qt6-qmlworkerscript-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlWorkerScript) qt6-core-private-devel qt6-qml-private-devel"

inherit rpm
