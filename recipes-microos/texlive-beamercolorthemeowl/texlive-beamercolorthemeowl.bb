SUMMARY = "A flexible beamer color theme to maximize visibility"
DESCRIPTION = "This package provides a flexible dark or light colour theme \
designed for maximum readability in environments where most \
themes fall flat. Main features: Dark color theme for \
presenting in low-light conditions. Optional light color theme \
for presenting in bright ambient light. Redefines color names \
'red', 'green', 'blue', 'yellow' to values that are visible \
when displayed by certain projectors, particularly those with a \
very bright green channel and dim red and blue channels. This \
behaviour can be optionally disabled, with the provided colours \
also available as 'OwlRed', 'OwlGreen', etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn40105"

RPM_NAME = "texlive-beamercolorthemeowl-2023.201.0.0.1.1svn40105-53.1.noarch.rpm"
RPM_HASH = "f14eec2e4ceecc6755c55e56020bab96e510d3e7d36f211a6afac6db8bb8663848cab68d28a906a7c815ae529c791bfed400b61ae2efb25106f8847882edd9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeowl.sty) texlive-beamercolorthemeowl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
