SUMMARY = "Create outlines for scientific documents"
DESCRIPTION = "Every scientifc document requires outlining before it is \
written. This package adds simple macros for your LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn45601"

RPM_NAME = "texlive-outlining-2023.201.0.0.1svn45601-54.1.noarch.rpm"
RPM_HASH = "8dd43c36c6998fd9a736c7e2b081e373e6cee15fa4aca6f6d45f2b3a8b1b45ab7c2940b0446d5f6bfa5f6078cf211400614188d3ae4e6c36ac2631d107ed6bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(outlining.sty) texlive-outlining"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(todonotes.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
