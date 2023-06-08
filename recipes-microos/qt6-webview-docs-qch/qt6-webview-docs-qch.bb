SUMMARY = "Documentation for qt6-webview in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webview in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-webview-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b18ca5d8c285a1dab15717e4f4800c4c98678ce127c9f96c7056a76b85f02c37eab0f98a78360060ecc92ce4542a48b2bc978231eccce026001e1325edb9e5d1"

RPROVIDES:${PN} += "qt6-webview-docs-qch qt6-webview-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
