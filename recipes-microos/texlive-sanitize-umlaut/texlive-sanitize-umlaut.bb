SUMMARY = "Sanitize umlauts for MakeIndex and pdfLaTeX"
DESCRIPTION = "This package sanitizes umlauts to be used directly in index \
entries for MakeIndex and friends with pdfLaTeX. This means \
that inside \\index an umlaut can be used as 'U or as U. In both \
cases, the letter is written as 'U into the raw index file for \
correct processing with MakeIndex and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn63770"

RPM_NAME = "texlive-sanitize-umlaut-2023.201.1.2.1svn63770-53.1.noarch.rpm"
RPM_HASH = "2440bcb8b6e83bcb19ca79149d45204971a3214c7837b59e62597983253a022d69a63ee0ed3e93aa90e1431a502715c600227d577bd950943cd3d5713c14d517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sanitize-umlaut.sty) texlive-sanitize-umlaut"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
