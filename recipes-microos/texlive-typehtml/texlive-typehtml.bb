SUMMARY = "Typeset HTML directly from LaTeX"
DESCRIPTION = "Can handle almost all of HTML2, and most of the math fragment \
of the draft HTML3."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17134"

RPM_NAME = "texlive-typehtml-2023.201.svn17134-52.1.noarch.rpm"
RPM_HASH = "15827642bcabf64774b22dec39ddf31492f9127df1d824f63734c0e437e5eb721b2041edbdc37dfcbb9fe02d4b25d51d16bb2d66c7666fac25e939d8dc7730ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(typehtml.sty) \
texlive-typehtml"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(exscale.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
