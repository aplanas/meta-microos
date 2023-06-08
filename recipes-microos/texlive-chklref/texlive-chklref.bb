SUMMARY = "Check for problems with labels in LaTeX"
DESCRIPTION = "It is quite common that after modifying a TeX file, many unused \
labels remain in it. The purpose of chklref is to automatically \
find these useless labels. It also looks for 'non starred' \
mathematical environments with no labels and advises the user \
to use a starred version instead."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.1.2svn52649"

RPM_NAME = "texlive-chklref-2023.201.3.1.2svn52649-53.1.noarch.rpm"
RPM_HASH = "eeb7523370fb706a535e64c8ea06e8e4a4450e797ef36b7847460d99f322e72fa50f423317c072486e3dccb196ef3486d0af3c874d7cd7385c0eb71ac8f8bc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chklref.sty) texlive-chklref"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Cwd) perl(File::Basename) perl(Getopt::Long) perl(strict) perl(warnings) sed tex(afterpackage.sty) tex(auxhook.sty) tex(currfile.sty) texlive texlive-chklref-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
