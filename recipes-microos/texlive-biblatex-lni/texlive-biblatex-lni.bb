SUMMARY = "LNI style for BibLaTeX"
DESCRIPTION = "BibLaTeX style for the Lecture Notes in Informatics, which is \
published by the Gesellschaft fur Informatik (GI e.V.)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn61719"

RPM_NAME = "texlive-biblatex-lni-2023.201.0.0.5svn61719-53.1.noarch.rpm"
RPM_HASH = "b70e6b6f18060d1856f7ced9885717c5d205cbb6548bfd2a09598ad7285bb7733576a6eb72c66e25dfc1dbc7b30f0050255dc46221c8854470f438e5b39863d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LNI-english.lbx) \
tex(LNI-ngerman.lbx) \
tex(LNI.bbx) \
tex(LNI.cbx) \
texlive-biblatex-lni"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphabetic.bbx) \
tex(alphabetic.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
