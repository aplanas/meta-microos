SUMMARY = "Marginal pictures"
DESCRIPTION = "Provides environments randbild to draw small marginal plots \
(using the packages pstricks and pst-plot), and randbildbasis \
(the same, only without the automatically drawn coordinate \
system)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-randbild-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "ae8f3347e4af72e9e1455eed64869a389f3484ada7b84104f741308fb1f18b27cb1fef562b4e059580b59ef0abf974826704c2b2cf5d68f87bb9d08bd2a57702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(randbild.sty) texlive-randbild"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pst-plot.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
