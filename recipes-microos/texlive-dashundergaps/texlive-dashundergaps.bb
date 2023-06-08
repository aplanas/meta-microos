SUMMARY = "Produce gaps that are underlined, dotted or dashed"
DESCRIPTION = "The package provides commands (\\underline, \\dotuline and \
\\dashuline) each of which underlines its argument with one of \
the styles the package is capable of. A phantom mode is \
provided, where the underline (of whatever form) can serve for \
a 'fill-in block' for student evaluation sheets."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.0hsvn58150"

RPM_NAME = "texlive-dashundergaps-2023.204.2.0hsvn58150-54.1.noarch.rpm"
RPM_HASH = "b86cb9982da7687a28780e197181177cf1bd9ea79f9c74395f69087ecfb1693b62b47a2a9f68c2c99edee646d1d290e5fea759189a41f80619b391800e65a500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dashundergaps.sty) texlive-dashundergaps"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(l3keys2e.sty) tex(ulem.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
