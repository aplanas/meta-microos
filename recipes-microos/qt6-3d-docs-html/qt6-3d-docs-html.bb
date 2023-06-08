SUMMARY = "Documentation for qt6-3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-3d-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ce5b34d4a8d807e4b6d870955fc9a58d7adc21c8a859a8c7b41c4226cb12ac555851fbcef131e55a1c5d1233ca785d2da44b39e7b1e2d9e0183c7a3e492a0185"

RPROVIDES:${PN} += "qt6-3d-docs-html qt6-3d-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
