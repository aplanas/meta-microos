SUMMARY = "Documentation for qt6-speech in HTML format"
DESCRIPTION = "This package contains documentation for qt6-speech in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-speech-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b6200db716ab50a19d57ca7fc0d02c72470e77aa66fe9a44aa788c12692153947ab79f561f4ad00ca6c80663377e8bab6a7b3104b7b1b59543d8fb5fa892acaa"

RPROVIDES:${PN} += "qt6-speech-docs-html qt6-speech-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
