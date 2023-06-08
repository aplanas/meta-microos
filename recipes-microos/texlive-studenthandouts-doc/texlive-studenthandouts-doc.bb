SUMMARY = "Documentation for texlive-studenthandouts"
DESCRIPTION = "This package includes the documentation for texlive-studenthandouts"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn43516"

RPM_NAME = "texlive-studenthandouts-doc-2023.201.1.0svn43516-57.1.noarch.rpm"
RPM_HASH = "c82c271e057dba513439031d844b3fbc934e6ffc9386eabc5fc0f8e709d0721ddafa2b5795effa546dc36e3cdc46290d563496cc6998a463b21d45dd5ce35d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-studenthandouts-doc"
RDEPENDS:${PN} += ""

inherit rpm
