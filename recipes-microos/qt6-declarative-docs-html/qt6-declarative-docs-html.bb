SUMMARY = "Documentation for qt6-declarative in HTML format"
DESCRIPTION = "This package contains documentation for qt6-declarative in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-declarative-docs-html-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "93340a2abe56610ea1ad06dcffaebbcb328493bcfc0d7cbcdbeaa496ada35aeeb3fe4d3cc08c719593ffa761b015455f9ad4223846fa353d6667e85609eaa9a0"

RPROVIDES:${PN} += "qt6-declarative-docs-html qt6-declarative-docs-html(aarch-64) qt6-quickcontrols2-docs-html"
RDEPENDS:${PN} += ""

inherit rpm
