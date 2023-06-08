SUMMARY = "Documentation for texlive-pas-crosswords"
DESCRIPTION = "This package includes the documentation for texlive-pas-crosswords"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn32313"

RPM_NAME = "texlive-pas-crosswords-doc-2023.201.1.03svn32313-51.1.noarch.rpm"
RPM_HASH = "b487d7c08a0bc30460d329eeff53ff1b53c476ff956dcb196bcd42fde692dd8ae63985cb670820d68c8b91305710483d509796de631a7b506e684814741ae354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pas-crosswords-doc:fr) texlive-pas-crosswords-doc"
RDEPENDS:${PN} += ""

inherit rpm
