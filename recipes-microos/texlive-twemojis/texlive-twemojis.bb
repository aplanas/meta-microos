SUMMARY = "Use Twitter's open source emojis through LaTeX commands"
DESCRIPTION = "This package provides a simple wrapper which allows to use \
Twitter's open source emojis through LaTeX commands. This \
relies on images, so no fancy unicode-font stuff is needed and \
it should work on every installation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1_twemoji_v14.0.1svn62930"

RPM_NAME = "texlive-twemojis-2023.201.1.3.1_twemoji_v14.0.1svn62930-52.1.noarch.rpm"
RPM_HASH = "af747f3385b990b55a504670499b9c3a77989556f5f5fa814ffa48533fd279ae01e20ac63470529ca4df285a20aef63eef90e5dc9bd745cd28f6bef0a59ced0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(twemojis.sty) texlive-twemojis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
