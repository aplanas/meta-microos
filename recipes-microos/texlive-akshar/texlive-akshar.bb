SUMMARY = "Support for syllables in the Devanagari script"
DESCRIPTION = "This LaTeX3 package provides macros and interfaces to work with \
Devanagari characters and syllables in a more correct way."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn56277"

RPM_NAME = "texlive-akshar-2023.201.0.0.2svn56277-54.1.noarch.rpm"
RPM_HASH = "d5286f884eb246c233438468048ed4c7ede75e59731aa83d0046c89d21942d527fd3c34aaa09f02c4817427f10ae19ecf258f4302700a2b5f08bc8579295852c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(akshar.sty) texlive-akshar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontspec.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
