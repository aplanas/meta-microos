SUMMARY = "Small scheme (basic + xetex, metapost, a few languages)"
DESCRIPTION = "This is a small TeX Live scheme, corresponding to MacTeX's \
BasicTeX variant. It adds XeTeX, MetaPost, various \
hyphenations, and some recommended packages to scheme-basic."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54191"

RPM_NAME = "texlive-scheme-small-2023.201.svn54191-56.1.noarch.rpm"
RPM_HASH = "ac6a2dd0776162da559cabea48e542b85cde815385bc0045824faeeb24eacaf0982ed0f26df055f296051b7248c62cda64148b2416f0927bd60db3bfa29a3171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-small"
RDEPENDS:${PN} += "texlive-babel-basque texlive-babel-czech texlive-babel-danish texlive-babel-dutch texlive-babel-english texlive-babel-finnish texlive-babel-french texlive-babel-german texlive-babel-hungarian texlive-babel-italian texlive-babel-norsk texlive-babel-polish texlive-babel-portuges texlive-babel-spanish texlive-babel-swedish texlive-collection-basic texlive-collection-latex texlive-collection-latexrecommended texlive-collection-metapost texlive-collection-xetex texlive-ec texlive-eurosym texlive-hyphen-basque texlive-hyphen-czech texlive-hyphen-danish texlive-hyphen-dutch texlive-hyphen-english texlive-hyphen-finnish texlive-hyphen-french texlive-hyphen-german texlive-hyphen-hungarian texlive-hyphen-italian texlive-hyphen-norwegian texlive-hyphen-polish texlive-hyphen-portuguese texlive-hyphen-spanish texlive-hyphen-swedish texlive-lm texlive-lualibs texlive-luaotfload texlive-luatexbase texlive-revtex texlive-synctex texlive-times texlive-tipa texlive-ulem texlive-upquote texlive-zapfding"

inherit rpm
