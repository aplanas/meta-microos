SUMMARY = "Documentation for qt6-websockets in QCH format"
DESCRIPTION = "This package contains documentation for qt6-websockets in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-websockets-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c6cfa5860d85f091336adefd509e63dbb7df4279fb5c3171967c2a4031feb1808f69e208a3216a869afc14bc6570e331a52b519759333cce60230c06f8897e91"

RPROVIDES:${PN} += "qt6-websockets-docs-qch \
qt6-websockets-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
