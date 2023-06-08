SUMMARY = "Documentation for texlive-spverbatim"
DESCRIPTION = "This package includes the documentation for texlive-spverbatim"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-spverbatim-doc-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "6df4390ac59d0411535d1d869b07146510947b5c6be8971a14d8ee00842ac60b9ec5303db78bfd9ef4a33019c7fa5cbf749c7335adea462ac550338de485d5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spverbatim-doc"
RDEPENDS:${PN} += ""

inherit rpm
