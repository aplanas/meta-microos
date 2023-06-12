SUMMARY = "Development files for qcoro"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 coroutines \
in connection with certain asynchronous Qt actions. \
This package provides development headers to use QCoro in Qt based \
applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "qcoro-qt6-devel-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "dca4f16f8820aaa28994edc9ca1d3892bd4eeafb7f0a17083e2bb277c69ad5b20b37fdfbf858980f04b6a7a7e0dfeb45f89eb7aad7f049eee1d38ce601b73e6f"

RPROVIDES:${PN} += "cmake(QCoro6) cmake(QCoro6Core) cmake(QCoro6Coro) cmake(QCoro6DBus) cmake(QCoro6Network) cmake(QCoro6Qml) cmake(QCoro6Quick) cmake(QCoro6Test) cmake(QCoro6WebSockets) qcoro-qt6-devel qcoro-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "libQCoro6Core0 libQCoro6DBus0 libQCoro6Network0 libQCoro6Qml0 libQCoro6Quick0 libQCoro6WebSockets0"

inherit rpm
