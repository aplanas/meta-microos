SUMMARY = "Export CTAN entries to bib format"
DESCRIPTION = "This package provides a Lua script which can be used for \
retrieving bibliographic information in BibLaTeX format for \
packages hosted on CTAN. The ctanbib script depends only on \
LuaXML."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2bsvn66068"

RPM_NAME = "texlive-ctanbib-2023.204.0.0.2bsvn66068-54.1.noarch.rpm"
RPM_HASH = "3bb89f13af28b9218b36610a4d5811b232b64b5dc3bbb1b6c434250b12e149dd6fe08953b3bcfb942869049edce81840346d05e0f86918f7a2dd43ed34963aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanbib"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep sed texlive texlive-ctanbib-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
