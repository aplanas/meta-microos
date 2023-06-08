SUMMARY = "Additional formats"
DESCRIPTION = "Collected TeX `formats', i.e., large-scale macro packages \
designed to be dumped into .fmt files -- excluding the most \
common ones, such as latex and context, which have their own \
package(s). It also includes the Aleph engine and related Omega \
formats and packages, and the HiTeX engine and related."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62226"

RPM_NAME = "texlive-collection-formatsextra-2023.201.svn62226-56.1.noarch.rpm"
RPM_HASH = "6e725526225da842528aaf6eaecd907e83ca3ca03d70249957b558d0b74c2db3f6ef20e7a8810ef462b26a07469b8bb1513e766949318ac8aa259bce1581cd72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-formatsextra"
RDEPENDS:${PN} += "texlive-aleph texlive-antomega texlive-collection-basic texlive-collection-latex texlive-edmac texlive-eplain texlive-hitex texlive-jadetex texlive-lambda texlive-lollipop texlive-mltex texlive-mxedruli texlive-omega texlive-omegaware texlive-otibet texlive-passivetex texlive-psizzl texlive-startex texlive-texsis texlive-xmltex texlive-xmltexconfig"

inherit rpm
