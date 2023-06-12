SUMMARY = "Counters as ordinal numbers in Portuguese"
DESCRIPTION = "The package provides a counter style (like \\arabic, \\alph and \
others) which produces as output strings like 'primeiro' \
('first' in Portuguese), 'segundo' (second), and so on up to \
1999th. Separate counter commands are provided for different \
letter case variants, and for masculine and feminine gender \
inflections."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-ordinalpt-2023.201.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "f6d56d5add894328eebc7e1e355e67f17deba76204aefe5fa9e696f485f5dca7c3b0775f2c217f8bf9c16178065ddda7e5f3c62916f428a035d413219d77392e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ordinalpt.sty) \
texlive-ordinalpt"
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
