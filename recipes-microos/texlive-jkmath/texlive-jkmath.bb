SUMMARY = "Macros for mathematics that make the code more readable"
DESCRIPTION = "Inspired by the physicspackage on CTAN, the package defines \
some simple macros for mathematical notation which make the \
code more readable and/or allow flexibility in typesetting \
material."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn47109"

RPM_NAME = "texlive-jkmath-2023.201.0.0.1svn47109-55.1.noarch.rpm"
RPM_HASH = "9a45ba60ea9f01eec04c91dae27e24e91aa5be6d80e1709f7f2394a29b01c679b2673c2e99e07383b9e3a156acc4cb27939948d2a315854048df7889454b72e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jkmath.sty) texlive-jkmath"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(array.sty) tex(physics.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
