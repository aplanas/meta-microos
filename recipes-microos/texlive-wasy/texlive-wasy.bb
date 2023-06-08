SUMMARY = "The wasy fonts (Waldi symbol fonts)"
DESCRIPTION = "This font contains all lasy characters (by L.Lamport, copyright \
notice in lasychr.mf), and a lot more symbols. Provided are the \
Metafont files for 5-10pt, and bold and slanted 10pt fonts, \
together with a .tex and .pdf documentation, and a file for \
using the fonts in a PLAIN-TeX document. Type-1 fonts by \
Michael Sharpe and Taco Hoekwater are available as separate \
package wasy-type1. Support under LaTeX is provided by Axel \
Kielhorn's wasysym package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.5svn53533"

RPM_NAME = "texlive-wasy-2023.201.2.5svn53533-53.1.noarch.rpm"
RPM_HASH = "269ded4ea59d2c49cc30030bb01bf4e10445f14ae4fbb5d8c1de8dcffbe99535f44a14c320045857206ebe816af5c1f4c1b63e53a0bcbbb174d5b4b7cc224445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wasy10.tfm) tex(wasy5.tfm) tex(wasy6.tfm) tex(wasy7.tfm) tex(wasy8.tfm) tex(wasy9.tfm) tex(wasyb10.tfm) tex(wasyfont.tex) tex(wasysl10.tfm) texlive-wasy"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
