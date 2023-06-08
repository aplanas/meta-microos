SUMMARY = "Extend the color package colour space"
DESCRIPTION = "The package makes the 216 'web-safe colours' available to the \
standard color package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn31490"

RPM_NAME = "texlive-colorweb-2023.201.1.3svn31490-53.1.noarch.rpm"
RPM_HASH = "6d68f348715b503ad5d5bc821f2211699981b8ba74bc7980bd65768c22cbfdf03ff82501a600a17897e660c2c3784ddb85e6c1d36076826cde0597efb668af9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colorweb.sty) texlive-colorweb"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
