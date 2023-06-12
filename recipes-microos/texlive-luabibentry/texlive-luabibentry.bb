SUMMARY = "Repeat BibTeX entries in a LuaLaTeX document body"
DESCRIPTION = "The package reimplements bibentry, for use in LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn55777"

RPM_NAME = "texlive-luabibentry-2023.201.0.0.1asvn55777-52.1.noarch.rpm"
RPM_HASH = "91409216b82e69e7a37af8245533f2c47da6cf642a217e81abeeab117faf8a57945f193c2bbf3e5bb19a33f9f026b128439921072905e2e00338b4fc04c23047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luabibentry.sty) \
texlive-luabibentry"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
