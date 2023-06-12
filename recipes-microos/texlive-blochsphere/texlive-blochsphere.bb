SUMMARY = "Draw pseudo-3D diagrams of Bloch spheres"
DESCRIPTION = "This package is used to draw pseudo-3D Blochsphere diagrams. It \
supports various annotations, such as great and small circles, \
axes, rotation markings and state vectors. It can be used in a \
standalone fashion, or nested within a tikzpicture environment \
by setting the environment option nested to true."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38388"

RPM_NAME = "texlive-blochsphere-2023.201.1.1svn38388-52.1.noarch.rpm"
RPM_HASH = "3c5120defea2018dd0eaa37ba96b0cb1f1d2d24e192fc0ce4021516974fab1790ed042e9fe7dde8fa742298951ef5b8787174987cc7c41527277646f59ab8422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(blochsphere.sty) \
texlive-blochsphere"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(ifthen.sty) \
tex(kvoptions.sty) \
tex(kvsetkeys.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
