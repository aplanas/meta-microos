SUMMARY = "LaTeX document shell for ANU final exam"
DESCRIPTION = "This LaTeX document shell is created for the standard \
formatting of final exams in The Australian National \
University."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn26053"

RPM_NAME = "texlive-anufinalexam-2023.201.svn26053-54.1.noarch.rpm"
RPM_HASH = "4a1f412ecd8af882093dc447c36f5438ec70f43ce6afe9011fc29cfa21589ab27a16cf29a1f4780d190bda5da7ea695f020bcebb158f119f57c37d2c01ea5eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anufinalexam"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
