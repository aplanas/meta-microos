SUMMARY = "Documentation for qt6-remoteobjects in QCH format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjects-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8aeb566361971233c504f762d8fe16282b5adb08d91020228d6ca26f7d5d1d5c13cc3984c4c552b73575518733ccdc6c899cfbd3c94bbc1e48aa81a72ce55dd8"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-qch qt6-remoteobjects-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
