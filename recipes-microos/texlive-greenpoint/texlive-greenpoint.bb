SUMMARY = "The Green Point logo"
DESCRIPTION = "A Metafont-implementation of the logo commonly known as 'Der \
Grune Punkt' ('The Green Point'). In Austria, it can be found \
on nearly every bottle. It should not be confused with the \
'Recycle'-logo, implemented by Ian Green."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-greenpoint-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "95a14849d872c50f25e7b31058ed2cf6a4bfc45bbd7cf55f8a9ca1ba29040f78685fadcb6891f1c5650b762af15ce1898f1cd063ff2959f33dab5cf1428961de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(greenpoint.tfm) \
texlive-greenpoint"
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
