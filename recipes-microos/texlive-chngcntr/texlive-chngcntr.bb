SUMMARY = "Change the resetting of counters"
DESCRIPTION = "Defines commands \\counterwithin (which sets up a counter to be \
reset when another is incremented) and \\counterwithout (which \
unsets such a relationship)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn47577"

RPM_NAME = "texlive-chngcntr-2023.201.1.1asvn47577-53.1.noarch.rpm"
RPM_HASH = "8da91fcd1a1f5a15502654f2b329d972b7bbdb93ab8a45d1ebeb778a8896fc30226411f80664f09cc817f591a7fd1d218d49b77928391f7596e70f4ecf24f858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chngcntr.sty) \
texlive-chngcntr"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
