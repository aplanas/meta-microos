SUMMARY = "Repeating text field substitution"
DESCRIPTION = "The package mailmerge provides an interface to produce text \
from a template, where fields are replaced by actual data, as \
in a database. The package may be used to produce several \
letters from a template, certificates or other such documents. \
It allows access to the entry number, number of entries and so \
on."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-mailmerge-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "53dcc5377035415526e31048fc52899236f6a8ad33939f06fb2468610245da8bcfeab5d41cffde8f18e116b5202b27c5efae767270e64ca3cc56f55dff8754d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mailmerge.sty) \
texlive-mailmerge"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
