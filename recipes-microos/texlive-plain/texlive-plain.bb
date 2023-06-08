SUMMARY = "The Plain TeX format"
DESCRIPTION = "Contains files used to build the Plain TeX format, as described \
in the TeXbook, together with various supporting files (some \
also discussed in the book)."
LICENSE = "SUSE-TeX"

PV = "2023.201.3.141592653svn57963"

RPM_NAME = "texlive-plain-2023.201.3.141592653svn57963-51.1.noarch.rpm"
RPM_HASH = "593edd2e9f93c5bd90aa05793997dedb4ae1d27b5fffc2e067151b303272091de4bb48b6f7f8bba8aba9139b29c3dff1e027f20b5045c17b5c05c2b1e8aca6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fontchart.tex) tex(gkpmac.tex) tex(letterformat.tex) tex(list-latin.tex) tex(list.tex) tex(llist-latin.tex) tex(llist.tex) tex(mptmac.tex) tex(pdftexmagfix.tex) tex(picmac.tex) tex(plain.tex) tex(wlist.tex) texlive-plain"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
