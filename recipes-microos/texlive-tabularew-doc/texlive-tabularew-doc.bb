SUMMARY = "Documentation for texlive-tabularew"
DESCRIPTION = "This package includes the documentation for texlive-tabularew"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-tabularew-doc-2023.201.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "ccbce44238a981eb45770dbe3708d6d1f614a3cdea989f71a71515859c6bb3cfe7fbbabb7cddd23b1f3c1beddf91eb66ab96c4796be41e3c3b6f95743d659b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularew-doc"
RDEPENDS:${PN} += ""

inherit rpm
