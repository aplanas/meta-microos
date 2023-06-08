SUMMARY = "Add emojis to citations"
DESCRIPTION = "This package adds emojis to citations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-2023.201.0.0.3svn55131-53.1.noarch.rpm"
RPM_HASH = "1b37f0ce4de1158e48b979506841aa01d3d9cd0dbd527555001be4621dea091fcdfb9a291fd234bccbaec7311bc3e79bdf2c34b6ee802e75177b70094e65deb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(emojicite.sty) texlive-emojicite"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(emoji.sty) tex(natbib.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
