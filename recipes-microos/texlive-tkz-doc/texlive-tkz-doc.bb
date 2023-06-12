SUMMARY = "Documentation macros for the TKZ series of packages"
DESCRIPTION = "This bundle offers a documentation class (tkz-doc) and a \
package (tkzexample). These files are used in the documentation \
of the author's packages tkz-base, tkz-euclide, tkz-fct, \
tkz-linknodes, and tkz-tab."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.45csvn66115"

RPM_NAME = "texlive-tkz-doc-2023.201.1.45csvn66115-52.1.noarch.rpm"
RPM_HASH = "c10ee059b93f711abb43060ab625e73814545816882cf4a04d9864e5cd3f067d88cc6efb6a2cb3c21f756c31589af98c3e6aa66e4e2cbcf6392ee1806a092aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-doc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
