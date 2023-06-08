SUMMARY = "Assorted support files for use with PSTricks"
DESCRIPTION = "An appropriate set of job options, together with process \
scripts for use with TeXnicCenter/"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pst-support-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "d44ce8cb4cec752dd3199ed2ba00341034097f680982f24b689b48765e1afbbdfb1f9c7929460e9d5ebcd8c64a503dd1d1122ae3c50c37a7f9fb1f143fabf0a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-support"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
