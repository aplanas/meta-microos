SUMMARY = "Development files for qcoro"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 coroutines \
in connection with certain asynchronous Qt actions. \
This package provides development headers to use QCoro in Qt based \
applications."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "qcoro-qt6-devel-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "75c53c222bfabb23ab35f5e6fb49f02fa482095179cd2ee0b914163fa13cd6f36535ec6c811928b58b49714af3a470cf1cec9d9bd3db284c894574ac160fa84c"

RPROVIDES:${PN} += "cmake(QCoro6) cmake(QCoro6Core) cmake(QCoro6Coro) cmake(QCoro6DBus) cmake(QCoro6Network) cmake(QCoro6Qml) cmake(QCoro6Quick) cmake(QCoro6WebSockets) qcoro-qt6-devel qcoro-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "libQCoro6Core0 libQCoro6DBus0 libQCoro6Network0 libQCoro6Qml0 libQCoro6Quick0 libQCoro6WebSockets0"

inherit rpm
