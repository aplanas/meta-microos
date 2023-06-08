SUMMARY = "Correct platex/uplatex bookmarks in PDF created with hyperref"
DESCRIPTION = "The package provides a small Ruby script that corrects \
bookmarks in PDF files created by platex/uplatex, using \
hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.30svn49252"

RPM_NAME = "texlive-convbkmk-2023.204.0.0.30svn49252-54.1.noarch.rpm"
RPM_HASH = "9da6ce3128f63e4c503c809339c8582c7f1736a0e23075b1bc84af2d58bc507287018d9c9817e99b460e77067a1a19a9137cb923425bc95359f66ad338b90bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-convbkmk"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby coreutils ed findutils grep sed texlive texlive-convbkmk-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
