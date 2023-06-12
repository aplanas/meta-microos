SUMMARY = "Metafont-PostScript conversions"
DESCRIPTION = "A Metafont support package including: epstomf, a tiny AWK \
script for converting EPS files into Metafont; mftoeps for \
generating (encapsulated) PostScript files readable, e.g., by \
CorelDRAW, Adobe Illustrator and Fontographer; a collection of \
routines (in folder progs) for converting Metafont-coded \
graphics into encapsulated PostScript; and roex.mf, which \
provides Metafont macros for removing overlaps and expanding \
strokes. In mftoeps, Metafont writes PostScript code to a \
log-file, from which it may be extracted by either TeX or AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn45818"

RPM_NAME = "texlive-roex-2023.201.svn45818-53.1.noarch.rpm"
RPM_HASH = "3ab2cc88f278d88e31d9fc1b672b78f493ad9cf3f32dc20816b7048928bc989ebbddf027b05302052d59eb90dcddd473428cf987de520ee9e6d1c347daaa5337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roex"
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
