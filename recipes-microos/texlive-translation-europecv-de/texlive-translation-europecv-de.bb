SUMMARY = "German version of europecv"
DESCRIPTION = "This is a 'translation' of the europecv documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23840"

RPM_NAME = "texlive-translation-europecv-de-2023.201.svn23840-52.1.noarch.rpm"
RPM_HASH = "94013504480f966f1e9b0bdf41effca21f9491f46025b9ce9f707210e2e0660e182af66aef8ad3f09bf3fad03225b18ec6c1e92a2f8ca33efdc3590521391773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-europecv-de"
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
