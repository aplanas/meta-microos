SUMMARY = "Expand acronyms at least once"
DESCRIPTION = "This package ensures that all acronyms used in the text are \
spelled out in full at least once. It also provides an \
environment to build a list of acronyms used. The package is \
compatible with pdf bookmarks. The package requires the suffix \
package, which in turn requires that it runs under e-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.47svn54758"

RPM_NAME = "texlive-acronym-2023.201.1.47svn54758-54.1.noarch.rpm"
RPM_HASH = "225261570224bda1eb944f09566918d397ecd72689141fca183630e7855b59562a230258ed44cdb3c36ff80759798f87151e6c0eebb425803158e3ee510546bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(acronym.sty) texlive-acronym"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(relsize.sty) tex(suffix.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
