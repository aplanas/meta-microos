SUMMARY = "Documentation for qt6-webengine in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webengine in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-webengine-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b81a26563cbffe32bfdd336a0aad0ff6be3ece44a01edfb0369e65d911e6ae09e60dc97d5ff694a08b97ad1669fbaa8abe1370fa403cf8f006b167677f27cd4c"

RPROVIDES:${PN} += "qt6-webengine-docs-html qt6-webengine-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
