SUMMARY = "Documentation for texlive-randomlist"
DESCRIPTION = "This package includes the documentation for texlive-randomlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn45281"

RPM_NAME = "texlive-randomlist-doc-2023.201.1.3svn45281-53.1.noarch.rpm"
RPM_HASH = "81899198eae21a566c320bf45ec661dd743ad1749d769517896a5c369398c38d296c97abe902244cccc27ec10b083647af12b2aa597c58b9e5fc91f57ed162ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomlist-doc"
RDEPENDS:${PN} += ""

inherit rpm
