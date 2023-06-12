SUMMARY = "Documentation for texlive-bxcjkjatype"
DESCRIPTION = "This package includes the documentation for texlive-bxcjkjatype"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn54080"

RPM_NAME = "texlive-bxcjkjatype-doc-2023.201.0.0.3svn54080-52.1.noarch.rpm"
RPM_HASH = "4eac99bfb045a4ac7efb62b16311d55e8ab6ce355bc780444400e95fd38da9bca24073d956dab10b0cf8f05407df44d6f4fa427555693933f7a9a0b11a141a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bxcjkjatype-doc:ja;en) \
texlive-bxcjkjatype-doc"
RDEPENDS:${PN} += ""

inherit rpm
