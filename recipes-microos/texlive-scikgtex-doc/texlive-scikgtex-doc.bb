SUMMARY = "Documentation for texlive-scikgtex"
DESCRIPTION = "This package includes the documentation for texlive-scikgtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn65256"

RPM_NAME = "texlive-scikgtex-doc-2023.201.2.1.1svn65256-53.1.noarch.rpm"
RPM_HASH = "0876112c84b4a37d4737a3ec41d0fa05a56c962949b8672e09c2f4800c95b3e0a467eccbeb73ebfa0906a46b479dbfb47c27963475092e1644509a981a545356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scikgtex-doc"
RDEPENDS:${PN} += ""

inherit rpm
