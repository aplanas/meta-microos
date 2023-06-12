SUMMARY = "German version of moreverb"
DESCRIPTION = "This is a 'translation' of the moreverb documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23957"

RPM_NAME = "texlive-translation-moreverb-de-2023.201.svn23957-52.1.noarch.rpm"
RPM_HASH = "fa8d96ca4beeb77ac89d247434cdcc09dd5e1c6a6a537a1cdb652546113a09ed551a56bd0ce4505428b99620d006965d54764d0493bf7858f16dc61d3edfbaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-moreverb-de"
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
