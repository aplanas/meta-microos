SUMMARY = "Non-ABI stable API for the Qt 6 QmlLocalStorage library"
DESCRIPTION = "This package provides private headers of libQt6QmlLocalStorage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmllocalstorage-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "a108f6b063239eaed650d3e598b8050017636d3f5775a9f62eb1aaa20ba663e00535e55c807ea83d471571787eea7d3ae5ce344e6f295bd3ec557fccc0edd0d2"

RPROVIDES:${PN} += "qt6-qmllocalstorage-private-devel qt6-qmllocalstorage-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlLocalStorage) qt6-core-private-devel qt6-qml-private-devel"

inherit rpm
