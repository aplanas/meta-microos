SUMMARY = "Documentation for qt6-svg in HTML format"
DESCRIPTION = "This package contains documentation for qt6-svg in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-svg-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "05dc76f732036c1f40b8dbd243a922564f53107cb10d240b0d795ace4aab54ad57615caefc0a1bf40beaa9e456fa4e6a22d77e6547364e71fd14a5bee072da2a"

RPROVIDES:${PN} += "qt6-svg-docs-html qt6-svg-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
