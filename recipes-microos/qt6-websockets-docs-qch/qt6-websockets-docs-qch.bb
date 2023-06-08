SUMMARY = "Documentation for qt6-websockets in QCH format"
DESCRIPTION = "This package contains documentation for qt6-websockets in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-websockets-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "24a8ae6abd8ea762ba27e48825ff5e31ac74f0e6d679755391e1f65d65f4ba488e6675adc45f4d1d8c2293e38d67d0e62dfd98a74cbd1ffd94a3d03d7993b774"

RPROVIDES:${PN} += "qt6-websockets-docs-qch qt6-websockets-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
