SUMMARY = "Perl script to print DVI meta information"
DESCRIPTION = "The package provides a perl script which prints information \
about a DVI file. It also supports XeTeX XDV format."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn59216"

RPM_NAME = "texlive-dviinfox-2023.201.1.06svn59216-53.1.noarch.rpm"
RPM_HASH = "4691864ca996638af324b4d506872af695b9095d993ea85633ec50d97c7efc30dc1c3c12a7c2bd0f142367d28298066e68e689a1f25497f7f314826cb7d9835d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(strict) \
sed \
texlive \
texlive-dviinfox-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
