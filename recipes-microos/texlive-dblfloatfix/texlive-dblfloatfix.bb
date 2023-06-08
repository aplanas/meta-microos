SUMMARY = "Fixes for twocolumn floats"
DESCRIPTION = "The package solves two problems: floats in a twocolumn document \
come out in the right order and allowed float positions are now \
[tbp]. The package actually merges facilities from fixltx2e and \
stfloats."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn28983"

RPM_NAME = "texlive-dblfloatfix-2023.201.1.0asvn28983-52.1.noarch.rpm"
RPM_HASH = "6af3e380c21824a619052222038b90660ec2117c1041ad9e01b5ff8c08b6f278b5940bd31f5865671cb2af619b5c5d2ef52395572c4dd0b6233d134a338a50a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dblfloatfix.sty) texlive-dblfloatfix"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fixltx2e.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
