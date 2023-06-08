SUMMARY = "International System of Units"
DESCRIPTION = "Typeset physical units following the rules of the International \
System of Units (SI). The package requires amstext, for proper \
representation of some values. Note that the package is now \
superseded by siunitx; siunits has maintenance-only support, \
now."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.36svn59702"

RPM_NAME = "texlive-siunits-2023.201.1.36svn59702-57.1.noarch.rpm"
RPM_HASH = "82eb0c261015e3365118272c7a29e19ef4079eb630e62fc7b0f92aacd4f4716e3a5bad8fd740f8d4ff61d21b8b9bc74161a1e3409a542427a97f6ccaa1dc4538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(SIunits.cfg) tex(SIunits.sty) tex(binary.sty) texlive-siunits"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amstext.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
