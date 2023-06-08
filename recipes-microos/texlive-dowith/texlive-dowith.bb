SUMMARY = "Apply a command to a list of items"
DESCRIPTION = "The package provides macros for applying a command to all \
elements of a list without separators, such as \
'\\DoWithAllIn{<cmd>}{<list-macro>}', and also for extending and \
reducing macros storing such lists. Applications in mind \
belonged to LaTeX, but the package should work with other \
formats as well. Loop and list macros in other packages are \
discussed. A further package, domore, is also provided, which \
enhances the functionality of dowith."
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.32svn38860"

RPM_NAME = "texlive-dowith-2023.201.r0.32svn38860-52.1.noarch.rpm"
RPM_HASH = "ba19a3b2351d29f6b3e935058b402dfb63cc8ae8362420d00e515823218857e469726a7491464a3d5dc1a8b7e1b01f954e60dee06d87bfac10edf836a4c854b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(domore.sty) tex(dowith.sty) texlive-dowith"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
