SUMMARY = "A package for typesetting isotopes"
DESCRIPTION = "The package provides a command \\isotope for setting the atomic \
weight and atomic number indications of isotopes. (The naive \
way of doing the job with (La)TeX mathematics commands produces \
an unsatisfactory result.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn23711"

RPM_NAME = "texlive-isotope-2023.201.0.0.3svn23711-55.1.noarch.rpm"
RPM_HASH = "32004929c9b6c446b67578cda93fa89a3f90c2a8af2ab826a5c51dba92bdf86efbbbf2c555c28e3365b9fc23aee643723372611850d26527c2b18f068ab7e758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(isotope.sty) texlive-isotope"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
