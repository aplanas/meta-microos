SUMMARY = "Documentation for qt6-scxml in HTML format"
DESCRIPTION = "This package contains documentation for qt6-scxml in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-scxml-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4bdcb7f1111e3114cef5e02b8c6bc1ff9d7a9a23b899c99c36ec1c00fe5f3f8ac85ec245826b779e36d81d16f11c1c6f080bf82105097deed71b4ffe9b6b11a5"

RPROVIDES:${PN} += "qt6-scxml-docs-html qt6-scxml-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
