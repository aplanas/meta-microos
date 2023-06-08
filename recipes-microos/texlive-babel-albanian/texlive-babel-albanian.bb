SUMMARY = "Support for Albanian within babel"
DESCRIPTION = "The package provides support for typesetting Albanian (as part \
of the babel system)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0dsvn57005"

RPM_NAME = "texlive-babel-albanian-2023.201.1.0dsvn57005-53.1.noarch.rpm"
RPM_HASH = "a23b60354cc40350965f523f6e2a596c4c1a40a84f12634c833a0e75d5dd0e95bfd63c307c9b2d87d93735162701190810d11aa3f09ba96a2794efe13ee8d941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(albanian.ldf) texlive-babel-albanian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
