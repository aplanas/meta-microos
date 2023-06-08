SUMMARY = "Use TrueType and OpenType fonts in math mode"
DESCRIPTION = "The mathfont package adapts unicode text fonts for math mode. \
The package allows the user to specify a default unicode font \
for different classes of math symbols, and it provides tools to \
change the font locally for math alphabet characters. When \
typesetting with LuaTeX, mathfont adds resizable delimiters, \
big operators, and a MathConstants table to text fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2asvn65205"

RPM_NAME = "texlive-mathfont-2023.201.2.2asvn65205-52.1.noarch.rpm"
RPM_HASH = "817691b1abc6a7e22c5b34aa943e49c8e9dcb59358a60a7a6b3ab2befabfc8ef8f25273b3e95f7e41a96ceb756e92c50fb978d2d9445b99c08229a453ca3c849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathfont.sty) texlive-mathfont"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
