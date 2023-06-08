SUMMARY = "A bibliography style with annotations"
DESCRIPTION = "The style is a derivative of the standard alpha style, which \
processes an entry's annotate field as part of the printed \
output."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52824"

RPM_NAME = "texlive-annotate-2023.201.svn52824-54.1.noarch.rpm"
RPM_HASH = "5e6acc96f8b83519388be5b70085182bbb2d45bc0e66a7eb715ebe69dfa7aa0d87b1eaa1930b26cd9dce9dce4263185cd63f92fac36b91f2c87a05e6840f9de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-annotate"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
