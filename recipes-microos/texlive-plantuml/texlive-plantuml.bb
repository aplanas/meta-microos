SUMMARY = "Support for rendering UML diagrams using the syntax and tool of PlantUML"
DESCRIPTION = "The package provides support for rendering UML diagrams using \
the syntax and tools of PlantUML. The PlantUML syntax is very \
short and thus enables quickly specifying UML diagrams. Using \
dot, PlantUML layouts the diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1svn55214"

RPM_NAME = "texlive-plantuml-2023.201.0.0.3.1svn55214-51.1.noarch.rpm"
RPM_HASH = "38dccedd73e612226eeb20dbc398f66340fb92cc52c9fe519d67de32c67d10781cd3fefa6c4015d304ebb74d20f796297fbb84a320f36b610c700ecf7d01b44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(plantuml.sty) texlive-plantuml"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjustbox.sty) tex(fancyvrb.sty) tex(ifthen.sty) tex(l3keys2e.sty) tex(luacode.sty) tex(pdftexcmds.sty) tex(pythontex.sty) tex(tikz.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
