SUMMARY = "Documentation for qt6-quick3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "328245e89aef2510db9e20d341b4a287233fb6e9fcf95a6777eef737f76ce078e4ef0681a5528fb2f24c5ea9723d212b3962538fc9f1013834d2020979162cb4"

RPROVIDES:${PN} += "qt6-quick3d-docs-html qt6-quick3d-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
