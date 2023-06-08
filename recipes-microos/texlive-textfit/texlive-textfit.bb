SUMMARY = "Fit text to a desired size"
DESCRIPTION = "Package to fit text to a given width or height by scaling the \
font. For example: \\scaletowidth{3in}{This}. (The job is done \
by calculating a magstep and applying it to the current font; \
thus 'This' will be very tall, as well as very wide; to scale \
in just one dimension, use the facilities of the graphicx \
package.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.5svn20591"

RPM_NAME = "texlive-textfit-2023.201.5svn20591-54.1.noarch.rpm"
RPM_HASH = "ef050509256087f10e613a214dfc23b8dfe6e8e0bf0e99fdbd62e82a74aa9999b0673f9f5069774510a6d86a0e1befe465167ec177230b311350303507749bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(textfit.sty) texlive-textfit"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
