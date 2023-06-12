SUMMARY = "Daily planner type calendar"
DESCRIPTION = "Prints two six-monthly vertical-type daily planner (i.e., \
months along the top, days downwards), with each 6-month period \
fitting onto a single A4 (or US letter) sheet. The package \
offers support for English, French, German, Spanish and \
Portuguese. The previous scheme of annual updates has now been \
abandoned, in favour of a Perl script yplan that generates a \
year's planner automatically. (The last manually-generated \
LaTeX file remains on the archive.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34398"

RPM_NAME = "texlive-yplan-2023.201.svn34398-52.1.noarch.rpm"
RPM_HASH = "86bf8420118d8e58407a6461d8a43e0850dbe17666ef7bde801396a90d5f1b577979ed69efb62155f0bcebd301f276beb4d55b3b293df1a681dec7375f2eeb5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(yplan.sty) \
texlive-yplan"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yplan-bin"

inherit rpm
