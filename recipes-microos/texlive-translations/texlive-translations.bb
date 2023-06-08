SUMMARY = "Internationalisation of LaTeX2e packages"
DESCRIPTION = "This package (once part of the exsheets package), provides a \
framework for providing multilingual features to a LaTeX \
package. The package has its own basic dictionaries for \
English, Brazilian, Catalan, Dutch, French, German and Spanish; \
it aims to use translation material for English, Dutch, French, \
German, Italian, Spanish, Catalan, Turkish, Croatian, \
Hungarian, Danish and Portuguese from babel or polyglossia if \
either is in use in the document. (Additional languages from \
the multilingual packages may be possible: ask the author.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn61896"

RPM_NAME = "texlive-translations-2023.201.1.12svn61896-52.1.noarch.rpm"
RPM_HASH = "7748548065380da2af72787ca7dec21def8e455ae1caef5adf6681a03e56080d4456968f84624d83ee09e361a07f324af11e66e62d6edda5d94be6bbddd217d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(translations.sty) texlive-translations"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(pdftexcmds.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
