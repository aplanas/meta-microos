SUMMARY = "Extended \\fbox macro from standard LaTeX"
DESCRIPTION = "This package redefines \\fbox to allow an optional argument for \
different frames. It can be any combination of l)eft, r)ight, \
t)op, and b)ottom, for example: \\fbox[lt]{foo}. Using uppercase \
letters or a combination of lowercase and uppercase is also \
possible."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.06svn62126"

RPM_NAME = "texlive-fbox-2023.201.0.0.06svn62126-52.1.noarch.rpm"
RPM_HASH = "70dbeffd7c1c362f61b641748b93a7b293c163dc3de29235718292eab4e30fe004e2fd8db8756574ada508c4f557f6f020642ea6d84162d9343b93a8ea05243b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fbox.sty) texlive-fbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
