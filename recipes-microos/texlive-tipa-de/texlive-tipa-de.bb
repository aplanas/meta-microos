SUMMARY = "German translation of tipa documentation"
DESCRIPTION = "This is a translation of Fukui Rei's tipaman from the tipa \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn22005"

RPM_NAME = "texlive-tipa-de-2023.201.1.3svn22005-52.1.noarch.rpm"
RPM_HASH = "4bec2f118b2c059dd02ee0a73c9715227e9174f872d94c8e81d96d03729e3283af44131a7afd8aa458ced3d521b0c0bb992b6a736268aef87d357cc01271a02c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tipa-de"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
