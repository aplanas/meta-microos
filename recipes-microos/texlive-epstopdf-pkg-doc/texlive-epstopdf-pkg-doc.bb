SUMMARY = "Documentation for texlive-epstopdf-pkg"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-doc-2023.201.2.11svn53546-53.1.noarch.rpm"
RPM_HASH = "e15077655c26466fe0100dda0752f1ca919efaa8a60650c692506bd18a241383253874c056ae3973ee5c06fd2ea6440b1dc22e0b03414505ab8fee1902ac3923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf-pkg-doc"
RDEPENDS:${PN} += ""

inherit rpm
