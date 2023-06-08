SUMMARY = "Documentation for qt6-webchannel in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-webchannel-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "869ef0f411939055145281a16aeea55e89cacb94cb9a192582c82ce52fefb1dead259d9ddc37a0046c1d342e536127a5a4fd687a9237c54d7ca9c398b61120a0"

RPROVIDES:${PN} += "qt6-webchannel-docs-html qt6-webchannel-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
