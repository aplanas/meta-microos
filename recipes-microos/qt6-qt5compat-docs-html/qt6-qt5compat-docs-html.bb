SUMMARY = "Documentation for qt6-qt5compat in HTML format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6dc87689ddcea4f46dfa1fe6740688d86f560a3f7772392adaccc80472273e41c01c12a40750590aa2a77ab1368c9ce7c07fdfaccfeab767d5ded77f53eafd9c"

RPROVIDES:${PN} += "qt6-qt5compat-docs-html \
qt6-qt5compat-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
