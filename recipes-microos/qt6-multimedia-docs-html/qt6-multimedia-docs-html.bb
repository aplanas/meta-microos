SUMMARY = "Documentation for qt6-multimedia in HTML format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimedia-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "572c983344c89adfc3211e4f641d9c1947efc2a3d3e70aac63ce1ac743a383a4a5b6b4cf3064dc029e4c8dbbaab315541ca6a345174684ee1dd698fc9f684070"

RPROVIDES:${PN} += "qt6-multimedia-docs-html qt6-multimedia-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
