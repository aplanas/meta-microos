SUMMARY = "Unicode algorithms for LuaTeX"
DESCRIPTION = "Lua code working with Unicode data has to deal with quite some \
challenges. For example there are many canonically equivalent \
sequences which should be treated in the same way, and even \
identifying a single character becomes quite different once you \
have to deal with all kinds of combining characters, emoji \
sequences and syllables in different scripts. Therefore \
lua-uni-algos wants to build a collection of small libraries \
implementing algorithms to deal with lots of the details in \
Unicode, such that authors of LuaTeX packages can focus on \
their actual functionality instead of having to fight against \
the peculiarities of Unicode. Given that this package provides \
Lua modules, it is only useful in Lua(HB)TeX. Additionally, it \
expects an up-to-date version of the unicode-data package to be \
present. This package is intended for package authors only; no \
user-level functionality provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn62204"

RPM_NAME = "texlive-lua-uni-algos-2023.201.0.0.4.1svn62204-52.1.noarch.rpm"
RPM_HASH = "eaa1e8a8c78c14cc90e28adebedad9fab93787db2ec6ccb3f79b0cd81c96e92607b587eddf3a2ab442dabcd845ef4570ea829e9bb1ba94880b180b0900c96abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uni-algos"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
