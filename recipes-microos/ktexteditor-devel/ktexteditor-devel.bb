SUMMARY = "Header files for ktexteditor, an embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library. \
 \
This subpackage provides the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "ktexteditor-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "4cdc05dde2453eb9d71ba873d3e1d41cb7f6cde12a1235e9d7ad34dc4493e6101dfc8e4e47ea5b6855029c1ba4e69bb62ec147bfdcf0c84e5ffe3196fe21bad3"

RPROVIDES:${PN} += "cmake(KF5TextEditor) ktexteditor-devel ktexteditor-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Parts) cmake(KF5SyntaxHighlighting) extra-cmake-modules ktexteditor"

inherit rpm
