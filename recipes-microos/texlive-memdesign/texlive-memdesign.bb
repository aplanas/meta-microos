SUMMARY = "Notes on book design"
DESCRIPTION = "'A Few Notes on Book Design' provides an introduction to the \
business of book design. It is an extended version of what used \
to be the first part of the memoir users' manual. Please note \
that the compiled copy, supplied in the package, uses \
commercial fonts; the README file contains instructions on how \
to compile the document without these fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48664"

RPM_NAME = "texlive-memdesign-2023.201.svn48664-52.1.noarch.rpm"
RPM_HASH = "be016b97da4f0580ce40a50252ee16f2d601d29616c3ae2d69360289f2e50ed0b54e8d3c0848deb0f59d52b54a297733ddb998ebb43eff4b5a3661098e933c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memdesign"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
