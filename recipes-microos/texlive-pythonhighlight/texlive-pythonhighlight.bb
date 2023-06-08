SUMMARY = "Highlighting of Python code, based on the listings package"
DESCRIPTION = "Highlighting of Python code, based on the listings package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43191"

RPM_NAME = "texlive-pythonhighlight-2023.201.svn43191-53.1.noarch.rpm"
RPM_HASH = "b99e42d080f59aac7664a63c0b2645a6267a2854c155a224f4ab3ac0d1e52ce207781c54f20ee1a42379d35c80bebb40364b7d436c7da9b8b7bdb15124e8f835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pythonhighlight.sty) texlive-pythonhighlight"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(listings.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
