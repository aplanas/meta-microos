SUMMARY = "Documentation for texlive-xepersian"
DESCRIPTION = "This package includes the documentation for texlive-xepersian"
LICENSE = "LPPL-1.0"

PV = "2023.201.24.8svn64872"

RPM_NAME = "texlive-xepersian-doc-2023.201.24.8svn64872-52.1.noarch.rpm"
RPM_HASH = "889b57c9b78afd32e3d90a6a98c9f2328deef0b2e263d266228c23acc86b051fee814f6dfbceb63dc02b66b5449c501d5d7779134115b85843830555dc024bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xepersian-doc"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
