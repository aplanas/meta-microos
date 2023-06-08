SUMMARY = "Display the value of a LaTeX counter in a variety of formats"
DESCRIPTION = "The package provides commands that display the value of a LaTeX \
counter in a variety of formats (ordinal, text, hexadecimal, \
decimal, octal, binary etc). The package offers some \
multilingual support; configurations for use in English (both \
British and American usage), French (including Belgian and \
Swiss variants), German, Italian, Portuguese and Spanish \
documents are provided. This package was originally provided as \
part of the author's datetime package, but is now distributed \
separately."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.07svn53912"

RPM_NAME = "texlive-fmtcount-2023.201.3.07svn53912-52.1.noarch.rpm"
RPM_HASH = "cc9469d29da8f5f4f0a64834bc2914781ad5aa84958ada397d0a98460d71779f0ae1724e43296dd17d0776734d14fcd964852206aeefc05ff6ed383adf7e39a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fc-UKenglish.def) tex(fc-USenglish.def) tex(fc-american.def) tex(fc-brazilian.def) tex(fc-british.def) tex(fc-english.def) tex(fc-francais.def) tex(fc-french.def) tex(fc-frenchb.def) tex(fc-german.def) tex(fc-germanb.def) tex(fc-italian.def) tex(fc-ngerman.def) tex(fc-ngermanb.def) tex(fc-portuges.def) tex(fc-portuguese.def) tex(fc-spanish.def) tex(fcnumparser.sty) tex(fcprefix.sty) tex(fmtcount.sty) texlive-fmtcount"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsgen.sty) tex(etoolbox.sty) tex(ifthen.sty) tex(itnumpar.sty) tex(keyval.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
