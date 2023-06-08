SUMMARY = "Variants of \\fbox and other games with boxes"
DESCRIPTION = "Provides variants of \\fbox: \\shadowbox, \\doublebox, \\ovalbox, \
\\Ovalbox, with helpful tools for using box macros and flexible \
verbatim macros. You can box mathematics, floats, center, \
flushleft, and flushright, lists, and pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn18304"

RPM_NAME = "texlive-fancybox-2023.201.1.4svn18304-52.1.noarch.rpm"
RPM_HASH = "eb2575278e7e768e473d8dc720b8e41d48d0f528355f1d346abdfe08b3b5ec78c467d3175a22ac591f75a11e22df68efa4e93b23be3effc3303b70502f2ccf87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fancybox.sty) texlive-fancybox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
