SUMMARY = "Adobe Type 1 format of Carolingian Minuscule fonts"
DESCRIPTION = "The bundle offers Adobe Type 1 format versions of Peter \
Wilson's Carolingian Minuscule font set (part of the bookhands \
collection). The fonts in the bundle are ready-to-use \
replacements for the Metafont originals."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-carolmin-ps-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "51db3788316e469d6c2460112363162c1dac6ce43dccf1ac9f0523a7bc3459a71c817e642efb3ed5ab93b8b9acffa57e887e6a5efc6a3f8e6265dd83c1bc535c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmin.map) texlive-carolmin-ps"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-carolmin-ps-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
