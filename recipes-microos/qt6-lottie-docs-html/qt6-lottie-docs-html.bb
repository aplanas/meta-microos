SUMMARY = "Documentation for qt6-lottie in HTML format"
DESCRIPTION = "This package contains documentation for qt6-lottie in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-lottie-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0a2d304b59a5c182606a161cfdb3c75dac4143df1d2540b9302274d63e9a1bfe522e5f6789837d04a75b70c62d3190d6a05ceb95f4eff2a0170610cc59e7b588"

RPROVIDES:${PN} += "qt6-lottie-docs-html qt6-lottie-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
