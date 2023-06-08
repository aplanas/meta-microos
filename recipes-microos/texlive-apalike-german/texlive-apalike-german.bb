SUMMARY = "A copy of apalike.bst with German localization"
DESCRIPTION = "A copy of apalike.bst (which is part of the base BibTeX \
distribution) with German localization."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65403"

RPM_NAME = "texlive-apalike-german-2023.201.svn65403-54.1.noarch.rpm"
RPM_HASH = "4331ef00a84a9c62ef37cdc53477a7d71b09033a4ed1fd7c786949c5bcbbe28794ff004f0928780b5d8c7e759bcdd601fd497e39af92fb8c906c3f40d5ab46de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-german"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
