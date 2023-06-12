SUMMARY = "E-TeX showbox facilities for exploration purposes"
DESCRIPTION = "The command \\logbox does \\showbox without stopping the \
compilation. The package's main command is \\viewbox*: the box \
is typeset (copied) with its dimensions, and its contents are \
logged in the .log file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24499"

RPM_NAME = "texlive-logbox-2023.201.1.0svn24499-54.1.noarch.rpm"
RPM_HASH = "2519ae874355fb9eb974842899dd9e2ce8e8bb8bebfbf1df5cea4df4c7af6ffb6f08dd8115c45a226706c4d55abcba06c481344d12d54f49f4810e069c3977cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(logbox.sty) \
texlive-logbox"
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
