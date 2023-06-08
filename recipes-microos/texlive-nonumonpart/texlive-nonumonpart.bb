SUMMARY = "Prevent page numbers on part pages"
DESCRIPTION = "The package bundles the answer to the long-standing FAQ about \
removing page numbers on \\part pages. The package accepts no \
options and defines no user commands; the user needs only to \
load it, and the requirement is met."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn22114"

RPM_NAME = "texlive-nonumonpart-2023.201.1svn22114-54.1.noarch.rpm"
RPM_HASH = "f11199875b63bf64c4bf840f0ee9daed405f0d86d64892e8e1fea90cc76e06506de5991eae1329310a09028ba9ba7112d4fe36a65733b68606a57e7f2b4fc735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nonumonpart.sty) texlive-nonumonpart"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
