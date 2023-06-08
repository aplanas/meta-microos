SUMMARY = "A LaTeX cheat sheet, in German"
DESCRIPTION = "This is a translation to German of Winston Chang's LaTeX cheat \
sheet (a reference sheet for writing scientific papers). It has \
been adapted to German standards using the KOMA script document \
classes."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn35702"

RPM_NAME = "texlive-latexcheat-de-2023.201.svn35702-54.1.noarch.rpm"
RPM_HASH = "93bfce06d59b5a870f736dbbd04542266163a2523f2f8792644a463a08b51b0922a44821a3061e981c36d1e44bf057d1635b670193dfecdc615ac27c65faad85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-de"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
