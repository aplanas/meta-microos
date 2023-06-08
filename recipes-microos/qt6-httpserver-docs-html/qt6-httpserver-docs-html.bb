SUMMARY = "Documentation for qt6-httpserver in HTML format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-httpserver-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9ad7a4a31b0441ef8c272cc6a23d759ef38ca5c2334ff0b680119d0af46f4e9baf809216002a76b30166471f8ed2ad91a1499d760edde78e69f56a9dee8e4afc"

RPROVIDES:${PN} += "qt6-httpserver-docs-html qt6-httpserver-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
