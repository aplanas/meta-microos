SUMMARY = "Additional formats"
DESCRIPTION = "Collected TeX `formats', i.e., large-scale macro packages \
designed to be dumped into .fmt files -- excluding the most \
common ones, such as latex and context, which have their own \
package(s). It also includes the Aleph engine and related Omega \
formats and packages, and the HiTeX engine and related."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn62226"

RPM_NAME = "texlive-collection-formatsextra-2023.208.svn62226-58.1.noarch.rpm"
RPM_HASH = "1eda842e47db3d0a4f95f406e02a10f7055cca9c1c076dfdcf942f5fc1a0836851e89c94dbe4daaf2655d5bc7db0fcfb59aa2aee6d36cf5ad08b495f71993a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-formatsextra"
RDEPENDS:${PN} += "texlive-aleph texlive-antomega texlive-collection-basic texlive-collection-latex texlive-edmac texlive-eplain texlive-hitex texlive-jadetex texlive-lambda texlive-lollipop texlive-mltex texlive-mxedruli texlive-omega texlive-omegaware texlive-otibet texlive-passivetex texlive-psizzl texlive-startex texlive-texsis texlive-xmltex texlive-xmltexconfig"

inherit rpm
