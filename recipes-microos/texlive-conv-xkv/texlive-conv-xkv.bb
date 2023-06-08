SUMMARY = "Create new key-value syntax"
DESCRIPTION = "This small package supports key-value syntax other than the \
standard LaTeX syntax of <key>=<value>. Using this package, \
create key-values of the form <key>:<value> or <key>-><value>, \
for example. The package converts the new notation to xkeyval \
notation and passes it on to xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn43558"

RPM_NAME = "texlive-conv-xkv-2023.204.svn43558-54.1.noarch.rpm"
RPM_HASH = "9ef874e87e5b1d166b882c92c97dc29789c5ce4a8b14c5cd16b40ee1467a4490a500faea2cc1cf55c3141b36f71702dd2cf162280d4ee98277bda174d24c9a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(conv-xkv.sty) texlive-conv-xkv"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
