SUMMARY = "Allow multiple web change files"
DESCRIPTION = "Tie was originally developed to allow web programmers to apply \
more than one change file to their source. The program may also \
be used to create a new version of a .web file that \
incorporates existing changes."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn66186"

RPM_NAME = "texlive-tie-2023.201.2.4svn66186-54.1.noarch.rpm"
RPM_HASH = "6c55b824b1498d3cbece679c62ef97a760fc31ce47a4c2ae33c2b794e6c5e3ce12d5ee9b44e1cc2461a9dda183ec2d8d2406bcd8c59a0188599b3eef13b4cd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(tie.1) texlive-tie"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-tie-bin"

inherit rpm
