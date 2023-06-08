SUMMARY = "Tools to define and use stacks"
DESCRIPTION = "The package provides a small set of commands to implement \
stacks independently of TeX's own stack. As an example of how \
the stacks might be used, the documentation offers a small \
'relinput' package that implements the backbone of the import \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn15878"

RPM_NAME = "texlive-stack-2023.201.1.00svn15878-57.1.noarch.rpm"
RPM_HASH = "a9cae74213e111d2c316828808f257d86be63ccde1deb7d7041381597ef6b6e48a22b59a403b3fc63447bec40a882bdb556e0b031b2b5c240db1122a8e8d792d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(relinput.sty) tex(stack.sty) texlive-stack"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
