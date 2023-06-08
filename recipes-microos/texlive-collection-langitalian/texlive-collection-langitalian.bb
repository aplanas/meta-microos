SUMMARY = "Italian"
DESCRIPTION = "Support for Italian."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55129"

RPM_NAME = "texlive-collection-langitalian-2023.201.svn55129-56.1.noarch.rpm"
RPM_HASH = "b6ca914bfb54adb4be87967b1d4b54ec73e7cfd14dac841bc86150eebc81037366bf939e316f81422e6a2e1170398d43218a31cec476d64934cabc31827e152d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langitalian"
RDEPENDS:${PN} += "texlive-amsldoc-it texlive-amsmath-it texlive-amsthdoc-it texlive-antanilipsum texlive-babel-italian texlive-codicefiscaleitaliano texlive-collection-basic texlive-fancyhdr-it texlive-fixltxhyph texlive-frontespizio texlive-hyphen-italian texlive-itnumpar texlive-l2tabu-italian texlive-latex4wp-it texlive-layaureo texlive-lshort-italian texlive-psfrag-italian texlive-texlive-it texlive-verifica"

inherit rpm
