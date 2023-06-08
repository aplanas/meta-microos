SUMMARY = "Emulation of obsolete package for 'here' floats"
DESCRIPTION = "Provides the H option for floats in LaTeX to signify that the \
environment is not really a float (and should therefore be \
placed 'here' and not float at all). The package emulates an \
older package of the same name, which has long been suppressed \
by its author. The job is done by nothing more than loading the \
float package, which has long provided the option in an \
acceptable framework."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16135"

RPM_NAME = "texlive-here-2023.201.svn16135-53.1.noarch.rpm"
RPM_HASH = "a851305f4919ae25959664c5c11bbba56a016ec5cf8fdd36d1be5e83ec9656ce16ddd3710e5c3b4cc40f35e566e36a3ebc1f5e99f1b8b3e93976171561528e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(here.sty) texlive-here"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(float.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
