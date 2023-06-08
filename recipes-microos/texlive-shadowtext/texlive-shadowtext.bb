SUMMARY = "Produce text with a shadow behind it"
DESCRIPTION = "The package introduces a command \\shadowtext, which adds a drop \
shadow to the text that is given as its argument. The colour \
and positioning of the shadow are customisable."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn26522"

RPM_NAME = "texlive-shadowtext-2023.201.0.0.3svn26522-53.1.noarch.rpm"
RPM_HASH = "dc730f9751421397f4569787e668f1a69146c6fcd79ff4eb4700a6e1343f8f436a1da702a9e12d578342544ba4b35c6e20fd08e89d79ceab69c0ac997902ce20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(shadowtext.sty) texlive-shadowtext"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
