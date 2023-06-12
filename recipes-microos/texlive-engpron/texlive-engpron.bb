SUMMARY = "Helps to type the pronunciation of English words"
DESCRIPTION = "This package provides macros beginning with the PS character, \
made active, which enable us to write the British or American \
English pronunciation as one can find it in the 'English \
Pronouncing Dictionary' by Daniel Jones. There is an option to \
typeset the pronunciation in the style of Harrap's dictionary."
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn16558"

RPM_NAME = "texlive-engpron-2023.201.2svn16558-53.1.noarch.rpm"
RPM_HASH = "838f91d0c156262cb27868b4e090ece53b51867bf27666d0a58c7c5d2ee6c8c908b733f0cfd12429ce7b12c69e1b696d5d82dc6ac0d628b7d51b226c1d8a5c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(engpron-tools.sty) \
tex(engpron.sty) \
texlive-engpron"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(drac.sty) \
tex(fancyvrb.sty) \
tex(ifthen.sty) \
tex(tipa.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
