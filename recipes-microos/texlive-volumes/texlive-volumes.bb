SUMMARY = "Typeset only parts of a document, with complete indexes etcetera"
DESCRIPTION = "This package helps you if you want to produce separate printed \
volumes from one LaTeX document, as well as one comprehensive, \
'all-inclusive' version. It suppresses the part of the table of \
contents that are not typeset, while counters, definitions, \
index entries etc. are kept consistent throughout the input \
file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-volumes-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "62393878f1593c4c75612ffed8ccffe4321833464ca36a2fbd11cc1bf86d67ff82c5d98eb0d1c2b0c4ae499905fea25f8338346a61eb242d62a34bf3af1c2662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nowtoaux.sty) tex(volumes.sty) texlive-volumes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(scrlfile.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
