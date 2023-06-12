SUMMARY = "Documentation for qt6-virtualkeyboard in QCH format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "be13224db16373366e5ccc7d94d0fc0b5fa3201d1dc5ad97baf46e61fb23b201cba6038acf7885dd873fbef1b79186112137a4f5163e357d76802233092fed8f"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-qch qt6-virtualkeyboard-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
