SUMMARY = "Documentation for qt6-websockets in HTML format"
DESCRIPTION = "This package contains documentation for qt6-websockets in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-websockets-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5941d54c7a09a368e158ea8f9ec3f3bc3ae502de2dc11dd7b04c6d01dac8270ce9f3d9e84bf7459b9e895ca6434c4f94f25ab11c9e6a2abfb365d25f8fdd9c9c"

RPROVIDES:${PN} += "qt6-websockets-docs-html qt6-websockets-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
