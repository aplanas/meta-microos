SUMMARY = "Unicode Collation Algorithm library for Lua"
DESCRIPTION = "The Lua-UCA library provides basic support for Unicode \
Collation Algorithm in Lua. It can be used to sort arrays of \
strings according to rules of particular languages. It can be \
used in other Lua projects that need to sort text in a language \
dependent way, like indexing processors, bibliographic \
generators, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn61023"

RPM_NAME = "texlive-lua-uca-2023.201.0.0.1bsvn61023-52.1.noarch.rpm"
RPM_HASH = "06e4231aec2183d2e143db5ddbdc2edee86197a0178e71331b891b2df8f4081d87409069fc2f01458ee89b9f8b29d6544f90cd20a9a5f20fef04563cce029145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uca"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
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
