SUMMARY = "Letter spacing"
DESCRIPTION = "Space out the letters of text; the command is \
\\letterspace<\\hbox modifier>{<text>}: the text is placed in an \
\\hbox of the specified size, and space is inserted between each \
glyph to make the text fit the box. Note that letterspacing is \
not ordinarily considered acceptable in modern typesetting of \
English."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn54266"

RPM_NAME = "texlive-letterspacing-2023.201.svn54266-54.1.noarch.rpm"
RPM_HASH = "660460bb08c1e9ce69bb565dd04417cf81daf883c8bd5ee3488017f971a473b83eacaf8249e7dd17aa47cc5d432a7f8de3f28b9506970db32c8593700fbfb563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(letterspacing.tex) texlive-letterspacing"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
