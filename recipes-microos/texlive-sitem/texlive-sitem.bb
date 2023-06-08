SUMMARY = "Save the optional argument of \\item"
DESCRIPTION = "The package modifies \\item commands to save the optional \
argument in a box."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn22136"

RPM_NAME = "texlive-sitem-2023.201.1.0svn22136-57.1.noarch.rpm"
RPM_HASH = "7bdf034ed49ce80ce4f8568ddb58d641d6c952daa4d6e86cc7fc9403ca727c6ad83849c881aa9bd645484da2b791dfd133e333e9afa8b225dabb7347794988b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sitem.sty) texlive-sitem"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
