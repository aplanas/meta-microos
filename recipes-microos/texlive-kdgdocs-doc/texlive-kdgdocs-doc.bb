SUMMARY = "Documentation for texlive-kdgdocs"
DESCRIPTION = "This package includes the documentation for texlive-kdgdocs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24498"

RPM_NAME = "texlive-kdgdocs-doc-2023.201.1.0svn24498-55.1.noarch.rpm"
RPM_HASH = "c85b6927c1c26c50fa3eee5821fb8224c48100d914e30248fcdce96bb370253af1e120773a3944c9de647e0d2121d9070433c20102b8eba727425efadaac09fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kdgdocs-doc"
RDEPENDS:${PN} += ""

inherit rpm
