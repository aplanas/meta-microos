SUMMARY = "Flexible and complete interface to document dimensions"
DESCRIPTION = "The package provides an easy and flexible user interface to \
customize page layout, implementing auto-centering and \
auto-balancing mechanisms so that the users have only to give \
the least description for the page layout. For example, if you \
want to set each margin 2cm without header space, what you need \
is just \\usepackage[margin=2cm,nohead]{geometry}. The package \
knows about all the standard paper sizes, so that the user need \
not know what the nominal 'real' dimensions of the paper are, \
just its standard name (such as a4, letter, etc.). An important \
feature is the package's ability to communicate the paper size \
it's set up to the output (whether via DVI \\specials or via \
direct interaction with pdf(La)TeX)."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.9svn61719"

RPM_NAME = "texlive-geometry-2023.201.5.9svn61719-52.1.noarch.rpm"
RPM_HASH = "62f68069e9b0990819ec09bb09a95ccebbd06566e30139bb54d946c12b94bd8ec2772d70b4917840fddbdccbfbd8ccf7d66c6911c6fae7c0f9612833d245247c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(geometry.sty) texlive-geometry"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(atbegshi.sty) tex(ifvtex.sty) tex(keyval.sty) texlive texlive-filesystem texlive-graphics texlive-iftex texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
