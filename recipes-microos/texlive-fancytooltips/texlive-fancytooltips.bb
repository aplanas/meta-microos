SUMMARY = "Include a wide range of material in PDF tooltips"
DESCRIPTION = "The package was inspired by the cooltooltips package. In \
contrast to cooltooltips, fancytooltips allows inclusion of \
tooltips which contain arbitrary TeX material or a series of \
TeX materials (animated graphics) from an external PDF file. To \
see the tooltips, you have to open the files in Adobe Reader. \
The links and JavaScripts are inserted using eforms package \
from the AcroTeX bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn56291"

RPM_NAME = "texlive-fancytooltips-2023.201.1.8svn56291-52.1.noarch.rpm"
RPM_HASH = "274bc54e6f25147b9bcfb9c1ba24078ec2bd47127996502fa3148e6631f3ce2bc844e49551fd8322c59855a755c41638aa7a8c6b5ccfcc4de838e39b78502fb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fancytooltips.sty) texlive-fancytooltips"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(atbegshi.sty) tex(eso-pic.sty) tex(graphicx.sty) tex(ocg.sty) tex(transparent.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
