SUMMARY = "Implements colour for packages hyperref and bookmark"
DESCRIPTION = "This package provides the code for the color option that is \
used by packages hyperref and bookmark. It is not intended as \
package for the user."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn53584"

RPM_NAME = "texlive-hycolor-2023.201.1.10svn53584-52.1.noarch.rpm"
RPM_HASH = "423a45e400272e1518eb74401cd067475e52fb6cfbc2702e7841ce2cde2aca00c339deff8f31099e0cec84d75787893ac02ac0e9e3d3852bd1e19e96022580f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hycolor.sty) tex(xcolor-patch.sty) texlive-hycolor"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(hopatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
