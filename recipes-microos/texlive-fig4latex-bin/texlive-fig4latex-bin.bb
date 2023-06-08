SUMMARY = "Binary files of fig4latex"
DESCRIPTION = "Binary files of fig4latex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14752"

RPM_NAME = "texlive-fig4latex-bin-2023.20230311.svn14752-89.1.aarch64.rpm"
RPM_HASH = "cd1bb07a0cc8baea2b996c3a244281346b792c5a1b222d8024f087585155905733284bd9f1a38e31510fe8efaab0108587b2cb13eefdde2cf5d323d42f79ccab"

RPROVIDES:${PN} += "texlive-fig4latex-bin texlive-fig4latex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-fig4latex"

inherit rpm
