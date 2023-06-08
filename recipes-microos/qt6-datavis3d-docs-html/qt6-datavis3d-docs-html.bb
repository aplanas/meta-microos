SUMMARY = "Documentation for qt6-datavis3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-datavis3d-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "aae25e7fd7139f3596be1a31df32ae8ea2e22e645652479cd63f399b87d79283f60a52af96ebbf876b8ad27c0b08adda05445255eaf98b1fcdabc3bb55d650c0"

RPROVIDES:${PN} += "qt6-datavis3d-docs-html qt6-datavis3d-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
