SUMMARY = "Generate English ordinal numbers"
DESCRIPTION = "The command \\nth{<number>} generates English ordinal numbers of \
the form 1st, 2nd, 3rd, 4th, etc. LaTeX package options may \
specify that the ordinal mark be superscripted, and that \
negative numbers may be treated; Plain TeX users have no access \
to package options, so need to redefine macros for these \
changes."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn54252"

RPM_NAME = "texlive-nth-2023.201.svn54252-54.1.noarch.rpm"
RPM_HASH = "08e34c466a467dd192fa474e713e339efd5a1366f2af163d41a344270295aa487bb145aef5531beba27b18e017e6ea450775f04dc946f9d854bfeca9dc242c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nth.sty) \
texlive-nth"
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
