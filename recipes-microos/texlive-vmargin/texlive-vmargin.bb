SUMMARY = "Set various page dimensions"
DESCRIPTION = "Provides a macro to set various margins as well as dimensions \
for header/footer and page dimensions. Most common paper sizes, \
paper orientation, disabling of headers and footers, and two \
sided printing are supported. The vmargin package does not rely \
on other packages and was designed with speed and size in mind. \
Its user interface might not be very fancy, but it's fast, \
small, and gets the job done. If you are looking for something \
more elaborate try the geometry package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5svn15878"

RPM_NAME = "texlive-vmargin-2023.201.2.5svn15878-53.1.noarch.rpm"
RPM_HASH = "3d57e8f4ccd550f75add7781094d441ea56570f4114669c1eca090aa9af7c2866da986cede531daa2e216f6067a0262c2911586e3319a9785c452127a40544de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(vmargin.sty) texlive-vmargin"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
