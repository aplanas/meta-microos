SUMMARY = "Documentation for qt6-serialport in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialport in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialport-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7539a62ea1a91282d4e2a1786ac15408deb81ce260725c3cd6dab2b6945cef0cb6e4a6ed0b003c02309b42bcbf9175ed83954ea15f3da2457d4ff18edfea3da4"

RPROVIDES:${PN} += "qt6-serialport-docs-html qt6-serialport-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
