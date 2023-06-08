SUMMARY = "Penguins with TikZ"
DESCRIPTION = "tikzpingus is a package similar to tikzducks but with penguins \
and a vast set of gadgets and extras (capable of changing the \
wing-positions, body-types, and more)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn64199"

RPM_NAME = "texlive-tikzpingus-2023.201.1.0svn64199-52.1.noarch.rpm"
RPM_HASH = "33f5b0fea96e09fc39032655f9b5bd3195290a57a16ffe036718af5e3b8ef2d9f37079c52b0c81413fb7f7a96d8e89e06c53b31e434711bff1605248b1a92f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzpingus-christmas.lib.tex) tex(tikzpingus-cloak.lib.tex) tex(tikzpingus-devil.lib.tex) tex(tikzpingus-emotions.lib.tex) tex(tikzpingus-flags.lib.tex) tex(tikzpingus-formal.lib.tex) tex(tikzpingus-fun.lib.tex) tex(tikzpingus-glasses.lib.tex) tex(tikzpingus-hats.lib.tex) tex(tikzpingus-horse.lib.tex) tex(tikzpingus-magic.lib.tex) tex(tikzpingus-medieval.lib.tex) tex(tikzpingus-movement.lib.tex) tex(tikzpingus-safe.lib.tex) tex(tikzpingus-science-fiction.lib.tex) tex(tikzpingus-shirts.lib.tex) tex(tikzpingus-signs.lib.tex) tex(tikzpingus-sport.lib.tex) tex(tikzpingus-technology.lib.tex) tex(tikzpingus.sty) texlive-tikzpingus"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
