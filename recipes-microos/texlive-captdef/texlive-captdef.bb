SUMMARY = "Declare free-standing \\caption commands"
DESCRIPTION = "The \\DeclareCaption command defines a class of caption command \
associated with the counter specified to the command. These \
commands are free-standing (i.e., don't need to be inside a \
float environment). The package uses \\DeclareCaption to define \
\\figcaption and \\tabcaption, which can be used outside figure \
or table environments."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17353"

RPM_NAME = "texlive-captdef-2023.201.svn17353-52.1.noarch.rpm"
RPM_HASH = "97fe8eeb2b5b8221b4b808ada9e0e3eea67d0f5e82f039599e33a8ccbbfcefbd8c0b866ada50918393b7a4752fa0efc11a36d0cf974ccc0397a64d875638884d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(captdef.sty) texlive-captdef"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
