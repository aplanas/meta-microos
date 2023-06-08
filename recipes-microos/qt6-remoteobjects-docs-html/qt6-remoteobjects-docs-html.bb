SUMMARY = "Documentation for qt6-remoteobjects in HTML format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjects-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b541e367786a75feebc770e8ba2d1c056d7640a5f6e1585a14300a94a8ac89584c89ce0b0e86aa05c104763859f8e83e89aea58c6f95a46f74dc9185fe106f42"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-html qt6-remoteobjects-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
