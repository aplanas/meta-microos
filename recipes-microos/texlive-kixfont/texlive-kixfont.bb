SUMMARY = "A font for KIX codes"
DESCRIPTION = "The KIX code is a barcode-like format used by the Dutch PTT to \
encode country codes, zip codes and street numbers in a \
machine-readable format. If printed below the address line on \
bulk mailings, a discount can be obtained. The font is \
distributed in Metafont format, and covers the numbers and \
upper-case letters."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18488"

RPM_NAME = "texlive-kixfont-2023.201.svn18488-55.1.noarch.rpm"
RPM_HASH = "f9ccdba2f49270022138c95e7efa4fb320d25d52af27b2975e2eae0b34fab126a040b1e014dcd6b3565bc523f10fd8ec57a2ba36233be1008b898ebb3a467c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kix.tfm) \
texlive-kixfont"
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
