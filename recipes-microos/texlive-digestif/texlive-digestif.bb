SUMMARY = "Editor plugin for LaTeX, ConTeXt etcetera"
DESCRIPTION = "Digestif is a code analyzer, and a language server, for LaTeX, \
plain TeX, ConTeXt and Texinfo. It provides context-sensitive \
completion, documentation, code navigation, and related \
functionality to any text editor that speaks the LSP protocol."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5.1svn65223"

RPM_NAME = "texlive-digestif-2023.201.0.0.5.1svn65223-52.1.noarch.rpm"
RPM_HASH = "a1c0d692e335b43a8c463900042cea0a12f1aec349255609a889523e666587c0ebad14d4a0020004e880c5eabbe16f5e479f4b57922aaf4dbc318b9ece212cfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digestif"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-digestif-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
