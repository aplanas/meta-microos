SUMMARY = "Extended array and tabular"
DESCRIPTION = "An experimental package which implements an environment, \
blockarray, that may be used in the same way as the array or \
tabular environments of standard LaTeX, or their extended \
versions defined in array. If used in math-mode, blockarray \
acts like array, otherwise it acts like tabular. The package \
implements a new method of defining column types, and also \
block and block* environments, for specifying sub-arrays of the \
main array. What's more, the \\footnote command works inside a \
blockarray."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07svn36406"

RPM_NAME = "texlive-blkarray-2023.201.0.0.07svn36406-52.1.noarch.rpm"
RPM_HASH = "5a3ab6392b45645dcd747b522d35c713f769acb9a000db1d8ac66b4a730322b3285021a52ac10b73ff9829917948855cbbccc86c847b3af43ceda8c97981204a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(blkarray.sty) texlive-blkarray"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.sty) tex(doc.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
