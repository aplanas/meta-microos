SUMMARY = "Documentation for qt6-charts in HTML format"
DESCRIPTION = "This package contains documentation for qt6-charts in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-charts-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a80e33434d75f8c301676261597c35cdba34fd6521041416c50121ea0fac9e241c53c3bb2a638c67a842b9dfe8905abd06f2d4b8c1a2cab2560ec2139fe66e80"

RPROVIDES:${PN} += "qt6-charts-docs-html qt6-charts-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
