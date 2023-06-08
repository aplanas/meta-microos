SUMMARY = "TeX macros for typesetting complex tables"
DESCRIPTION = "The package offers a simple notation for pretty complex tables \
(to Michael J. Ferguson's credit). With PostScript, the package \
allows shaded/coloured tables, diagonal rules, etc. The package \
is supposed to work with both Plain and LaTeX. An AWK converter \
from ASCII semigraphic tables to TAP notation is included."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.77svn31731"

RPM_NAME = "texlive-tap-2023.201.0.0.77svn31731-54.1.noarch.rpm"
RPM_HASH = "ec800aa8fe8657f6d204ddcba88d040e80d302d3e0e27afd3b5e9de45cbe250ec52992448b210d8b7bd19754287e5696bd5d427ab2b0a6b1b87adc5eb2eaf635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tap.tex) texlive-tap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
