SUMMARY = "OpenType 'loader' for Plain TeX and LaTeX"
DESCRIPTION = "The package adopts the TrueType/OpenType Font loader code \
provided in ConTeXt, and adapts it to use in Plain TeX and \
LaTeX. It works under LuaLaTeX only."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.23svn64616"

RPM_NAME = "texlive-luaotfload-2023.201.3.23svn64616-52.1.noarch.rpm"
RPM_HASH = "e729d98aba43d3c3015c841c07277b00c5b3db825a681f93d08d4fb0e410a793decd7fea37601693f98df528fba46c4d4e47691f555793cbe98c8f3129f71c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luaotfload-blacklist.cnf) tex(luaotfload.sty) texlive-luaotfload"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-lm texlive-lua-alt-getopt texlive-lua-uni-algos texlive-lualibs texlive-luaotfload-bin texlive-scripts texlive-scripts-bin"

inherit rpm
