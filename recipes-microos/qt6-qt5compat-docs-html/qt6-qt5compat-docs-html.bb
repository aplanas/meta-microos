SUMMARY = "Documentation for qt6-qt5compat in HTML format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-qt5compat-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0f8235db2e66fe199fffe30a9be6a6df64fff1009960f92259e151a960c5ce4f6231ff0bff8d132417c3dfcf5d8910d7286b958fed0978ec31393d27962e2b27"

RPROVIDES:${PN} += "qt6-qt5compat-docs-html qt6-qt5compat-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
