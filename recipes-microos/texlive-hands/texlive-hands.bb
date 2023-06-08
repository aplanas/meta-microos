SUMMARY = "Pointing hand font"
DESCRIPTION = "Provides right- and left-pointing hands in both black-on-white \
and white-on-black realisation. The font is distributed as \
Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn13293"

RPM_NAME = "texlive-hands-2023.201.svn13293-53.1.noarch.rpm"
RPM_HASH = "f5076b68bddb9dafef57b99cdecf444a81be367437c867370df216aaf263023b31f8ad603737dd44ee455ff8240f3310b3d0d61b94dc7588e4ac79d5098d8344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hands.tfm) texlive-hands"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
