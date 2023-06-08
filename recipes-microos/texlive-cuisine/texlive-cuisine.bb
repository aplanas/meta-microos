SUMMARY = "Typeset recipes"
DESCRIPTION = "Typeset recipes with the ingredients lined up with their method \
step (somewhat similarly to the layout used in cooking)."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.7svn34453"

RPM_NAME = "texlive-cuisine-2023.204.0.0.7svn34453-54.1.noarch.rpm"
RPM_HASH = "9dcb702f2befc4a88f766ce9bf86caacc38e8cdbe5e32b52813371c93c83c7e455f5cba570e85e0e6952dc60c71628afb0f1651aacc27de550560bea9f960426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cuisine.sty) texlive-cuisine"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(nicefrac.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
