SUMMARY = "Support for floating point operations at LaTeX level"
DESCRIPTION = "This package provides an interface to the LaTeX3 floating point \
unit (part of expl3), mainly used for PSTricks related packages \
to allow math expressions at LaTeX level. siunitx is used for \
formatting the calculated number. The package also depends on \
xkeyval and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn49817"

RPM_NAME = "texlive-pst-calculate-2023.201.0.0.02svn49817-52.1.noarch.rpm"
RPM_HASH = "00ea45b7fbf80f4b42a6344ba33413bc8a44c87573c4e6184f93f131cc66e0f8fc86ab01222ffe2d137d96c791a0f6f71b4597f3253e78d4fbdfba9c167d5c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-calculate.sty) texlive-pst-calculate"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(siunitx.sty) tex(xkeyval.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
