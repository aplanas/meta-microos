SUMMARY = "Macros for using characters from Unicode's Private Use Area"
DESCRIPTION = "While Unicode supports the vast majority of use cases, there \
are certain specialized niches which require characters and \
glyphs not (yet) represented in the standard. Thus the Private \
Use Area (PUA) at code points E000-F8FF, which enables third \
parties to define arbitrary character sets. This package allows \
configuring a number of macros for using various PUA character \
sets in LaTeX (AGL, CYFI, MUFI, SIL, TITUS, UCSUR, UNZ), to \
enable transcription and display of medieval and other \
documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66225"

RPM_NAME = "texlive-unicode-alphabets-2023.201.svn66225-53.1.noarch.rpm"
RPM_HASH = "f9e33fbd052d3f93218c7a9dfdea7fdb7da84e67b9d4c8a1f0ea30fed6374b7fc4a40cb6a7cec8be0df8408333c808e9f16da197ba0858b0f6bf48071e1528ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unicode-alphabets.sty) texlive-unicode-alphabets"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(csvsimple.sty) tex(etoolbox.sty) tex(pgfkeys.sty) tex(pgfopts.sty) tex(stringstrings.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
