SUMMARY = "Typeset business cards"
DESCRIPTION = "This is an adaption for current LaTeX of a LaTeX 2.09 style by \
Silvano Balemi. It produces cards at the normal US card size, \
76.2mm x 50.8mm."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-bizcard-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "b9ac5b493a4b27e98812c9625789765bae0158eff1e85200281fca0fad6567aeb35018fef5d5fdc653b787e752fd8e75f0aee76bc21b54e81ac42d786f5c1110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bizcard.sty) texlive-bizcard"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(geometry.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
