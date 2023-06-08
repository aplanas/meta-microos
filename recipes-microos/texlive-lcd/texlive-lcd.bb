SUMMARY = "Alphanumerical LCD-style displays"
DESCRIPTION = "A LaTeX package that will display text as on an (early) LCD \
display (the output is very visibly pixellated). Assumes 8-bit \
input in its internal verbatim-style environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn16549"

RPM_NAME = "texlive-lcd-2023.201.0.0.3svn16549-54.1.noarch.rpm"
RPM_HASH = "1beb8e4ed0f3696bb43b2d0ac5f320a7ac690713f0dfeff708896a2995a495d7d506be9a822a6f80964284071b9ccf4563d9c1fcd33d6c1ccfecce55d0a8094a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lcd.sty) texlive-lcd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
