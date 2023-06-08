SUMMARY = "Flag style derivation package"
DESCRIPTION = "The flagderiv package is used to create mathematical \
derivations using the flag/flagpole notation. The package \
features an intuitive command syntax, opening and closing \
multiple flagpoles, different comment styles, customizable \
symbols and label namespaces."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.10svn15878"

RPM_NAME = "texlive-flagderiv-2023.201.0.0.10svn15878-52.1.noarch.rpm"
RPM_HASH = "a8cd70bc3d947b8bbe7ee7dcf0ac51c8f048dae686cfc617807f3d63c24021d0404a1fafb67ef3fd048ab6c6b0437f1acf33a60fb144f21333772a32a78dfb9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(flagderiv.sty) texlive-flagderiv"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(ifthen.sty) tex(longtable.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
