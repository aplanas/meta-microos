SUMMARY = "Development files for muparserx"
DESCRIPTION = "The API documentation for muParserX."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "muparserx-devel-doc-4.0.12-1.1.noarch.rpm"
RPM_HASH = "b2b9449d51dbccefd20319d0e54cf4b33fe446609e46cf3016aa0e54547f42dbf385994633da3e62bb1bc0be29306ca9b22c7e886379dc30b0c460dd2197dedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "muparserx-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
