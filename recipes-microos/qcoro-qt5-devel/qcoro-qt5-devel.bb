SUMMARY = "Development files for qcoro"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 coroutines \
in connection with certain asynchronous Qt actions. \
This package provides development headers to use QCoro in Qt based \
applications."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "qcoro-qt5-devel-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "5f6cb4417733c61aeb2a14a60273eb0a850b9f244d483a1e52cc2e8a78109b4ab6b724cbd92e62295728ca998be2181ea3ba8e88b9f5fb7b045dad4c488a3d4f"

RPROVIDES:${PN} += "cmake(QCoro5) cmake(QCoro5Core) cmake(QCoro5Coro) cmake(QCoro5DBus) cmake(QCoro5Network) cmake(QCoro5Qml) cmake(QCoro5Quick) cmake(QCoro5WebSockets) qcoro-qt5-devel qcoro-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "libQCoro5Core0 libQCoro5DBus0 libQCoro5Network0 libQCoro5Qml0 libQCoro5Quick0 libQCoro5WebSockets0"

inherit rpm
