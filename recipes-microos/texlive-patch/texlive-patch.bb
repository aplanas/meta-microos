SUMMARY = "Patch loaded packages, etcetera"
DESCRIPTION = "The package defines macros that allow patching of existing \
commands, specifying those parts of the existing macro to be \
replaced, along with the replacements. Thus it provides more \
sophisticated manipulation than a package like patchcmd, which \
only permits modification by adding commands at the beginning \
or end of an existing definition. The package is distributed in \
a relative of LaTeX doc format: it will run unmodified, though \
it benefits from docstrip treatment."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42428"

RPM_NAME = "texlive-patch-2023.201.svn42428-51.1.noarch.rpm"
RPM_HASH = "6cec55264d230a97801d38bf11ad57ad2063c16bb0c47e65c414a473656eee1d74191ca88ffad69d96c7a3a7ae7847e7d940593c16a57d03ecd646ec41420951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patch"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
