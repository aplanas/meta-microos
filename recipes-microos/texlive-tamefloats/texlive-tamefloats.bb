SUMMARY = "Experimentally use \\holdinginserts with LaTeX floats"
DESCRIPTION = "LaTeX's figures, tables, and \\marginpars are dangerous for \
footnotes (and probably also \\enlargethispage). Here is a \
proposal (a 'patch' package) to help, by using \\holdinginserts \
in a simple way. It replaces the original problem with a new \
one -- it is an experiment to find out whether the new problem \
is less bad (or it is just a contribution to the discussion, \
maybe just a summary of previous work). The files provide \
further information."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.42svn27345"

RPM_NAME = "texlive-tamefloats-2023.201.0.0.42svn27345-54.1.noarch.rpm"
RPM_HASH = "c22dee2eec6c9a650add1f70e0ffb4e28ee4acaf50c42dcd5de6606f0a318728da11eb77cc323934f3e71507ed7feeed2bba8731795652dcf7859659e4307b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tameflts.sty) \
texlive-tamefloats"
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
