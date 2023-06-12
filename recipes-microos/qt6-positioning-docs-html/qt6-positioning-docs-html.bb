SUMMARY = "Documentation for qt6-positioning in HTML format"
DESCRIPTION = "This package contains documentation for qt6-positioning in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a003ebe380f45eb475d0070a63710fffb8aa54831977aeca603ea9d215d186a9f4190a134796a6e58598a7f5d224b8d7832fc1d283752736d18cf951b53861e9"

RPROVIDES:${PN} += "qt6-location-docs-html \
qt6-positioning-docs-html \
qt6-positioning-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
