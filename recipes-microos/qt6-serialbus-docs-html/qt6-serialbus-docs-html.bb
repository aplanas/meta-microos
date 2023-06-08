SUMMARY = "Documentation for qt6-serialbus in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialbus-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a3537db298f204df3020db3aa82e754e22700c2e550b1a1d0f7c76bcb9420d790f0f1567eab5febbf1266d3f1db60cebe3d126670a485715e65bc47d59dbf1dd"

RPROVIDES:${PN} += "qt6-serialbus-docs-html qt6-serialbus-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
