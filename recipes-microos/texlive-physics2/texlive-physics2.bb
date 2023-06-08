SUMMARY = "Macros for typesetting math faster and more simply"
DESCRIPTION = "The physics2 package defines commands for typesetting math \
formulae faster andmore simply. physics2 is a modularized \
package, each module provides its own function. You can load \
modules separately after loading `physics2`. Modules of physics \
provide the following supports: Automatic braces; Dirac bra-ket \
notation; Easy way to typeset diagonal matrices and matrices \
with similar entries; Double cross and double dot (binary) \
operators for tensors."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn66115"

RPM_NAME = "texlive-physics2-2023.201.0.0.1.1svn66115-51.1.noarch.rpm"
RPM_HASH = "a9da6fc801f040cc935aeacb7925c102054db78c6c48f761e771945a01275b0eb38ad3c0deb406249b57354dc24f1473cc867630ffff7a224e6a9b27d5257a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phy-ab.braket.sty) tex(phy-ab.legacy.sty) tex(phy-ab.sty) tex(phy-bm-um.legacy.sty) tex(phy-braket.sty) tex(phy-common.sty) tex(phy-diagmat.sty) tex(phy-doubleprod.sty) tex(phy-explsetup.sty) tex(phy-nabla.legacy.sty) tex(phy-op.legacy.sty) tex(phy-qtext.legacy.sty) tex(phy-xmat.sty) tex(physics2.sty) texlive-physics2"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amstext.sty) tex(fixdif.sty) tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
