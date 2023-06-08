SUMMARY = "Documentation for texlive-intopdf"
DESCRIPTION = "This package includes the documentation for texlive-intopdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn63987"

RPM_NAME = "texlive-intopdf-doc-2023.201.0.0.4.1svn63987-52.1.noarch.rpm"
RPM_HASH = "ee37278775f3889732fbf4fb9807698b5e95dc27bd577d1928463f956e28296449790eab679da11d18bea7886d40f880a1c5ec4b1c5a92637bd1712f2a13d2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intopdf-doc"
RDEPENDS:${PN} += ""

inherit rpm
