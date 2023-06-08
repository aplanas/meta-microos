SUMMARY = "Chicago-style footnote formatting"
DESCRIPTION = "A very short snippet. Will set the footnotes to be conformant \
with the Chicago style, so the footnotes at the bottom of the \
page are now marked with a full-sized number, rather than with \
a superscript number."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn57312"

RPM_NAME = "texlive-chifoot-2023.201.1.0svn57312-53.1.noarch.rpm"
RPM_HASH = "f0ebe47c2ab4a0ce0ece4438802941a1805de385ccfad8a5e6c8850f5165b43f0f892dc33cc05bc20fcee4f54b354c9994d6a47204c617eca14a2e7da8a0561a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chifoot.sty) texlive-chifoot"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
