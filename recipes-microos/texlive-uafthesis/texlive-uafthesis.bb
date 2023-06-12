SUMMARY = "Document class for theses at University of Alaska Fairbanks"
DESCRIPTION = "This is an 'unofficial' official class."
LICENSE = "LPPL-1.0"

PV = "2023.201.12.12svn57349"

RPM_NAME = "texlive-uafthesis-2023.201.12.12svn57349-52.1.noarch.rpm"
RPM_HASH = "0abe490133cb9ceb62b7eb886fb56f4d1463aaeb8b2f6fb2d7ce881be3910c3ddf6133b4023c95411bcafc91652df5b8ab1d58a93690f53b2574939e029e4be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uafthesis.cls) \
texlive-uafthesis"
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
