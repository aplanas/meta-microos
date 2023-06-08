SUMMARY = "Generate BibTeX entries for various IETF index files"
DESCRIPTION = "The package provides scripts to translate IETF index files to \
BibTeX files."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn41332"

RPM_NAME = "texlive-ietfbibs-2023.201.1.0.0svn41332-52.1.noarch.rpm"
RPM_HASH = "da591ae4b635a5580cdf7de24d4c6ddc108b5bc47bf21caf018e69ffb60b7dff82246626db917c6d0e736ecb40503636614cdb837f805873fb05faf9ca2a4dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ietfbibs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
