SUMMARY = "Documentation for qt6-mqtt in HTML format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-mqtt-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "89358fa37136791f252ca4c6a0c0c5282aab15ca50b9b5ff4590b1fb44e25cfe0c4d430190cda97ffdfd9faad2329fd3b8a647d075c3d53b5bdb15569363ae01"

RPROVIDES:${PN} += "qt6-mqtt-docs-html qt6-mqtt-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
