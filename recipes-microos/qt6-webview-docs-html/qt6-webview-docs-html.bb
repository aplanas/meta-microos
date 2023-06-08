SUMMARY = "Documentation for qt6-webview in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webview in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-webview-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ae37d31922d2c3379191c7d666cee11aaf570ca5089b8c179b193bc3c50da7cb661d1ff74c7ae0f964c569e7a4baccbb27a4fc5db34c1803be0843750ecab314"

RPROVIDES:${PN} += "qt6-webview-docs-html qt6-webview-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
