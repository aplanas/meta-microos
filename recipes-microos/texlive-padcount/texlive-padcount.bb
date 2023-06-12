SUMMARY = "Pad numbers with arbitrary characters"
DESCRIPTION = "This package provides some simple macros which will pad numbers \
(or, indeed, any expanded token) with your choice of character \
(defaulting to '0') to your choice of number of places \
(defaults to '2'). This works not only on arabic numerals, but \
on any expanded list of tokens passed to it. This makes it \
suitable for, among other things, counters of all kinds."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47621"

RPM_NAME = "texlive-padcount-2023.201.1.0svn47621-51.1.noarch.rpm"
RPM_HASH = "d96f6c9d04973274f63681be3355da254f741fbb83bb1047bd5894c18bcd9694a48a304a6d3cfe1e9cbe00289020e87ce1cd5f7a6a0659cf2195bb68d945d303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(padcount.sty) \
texlive-padcount"
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
