SUMMARY = "Estonian introduction to LaTeX"
DESCRIPTION = "This is the Estonian translation of Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.5.05svn39323"

RPM_NAME = "texlive-lshort-estonian-2023.201.5.05svn39323-54.1.noarch.rpm"
RPM_HASH = "a0a5a80bfe74569ab3354a9a90ed175bda312fbe4f1dc676183239d7a4ce313d8aa263f2d93a49c78838e8061bdb466a2525269e08b6c796bf0b498e969bf659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-estonian"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
