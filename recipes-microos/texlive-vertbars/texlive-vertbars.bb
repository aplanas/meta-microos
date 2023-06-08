SUMMARY = "Mark vertical rules in margin of text"
DESCRIPTION = "This package is an extension to lineno, replacing that \
package's line numbers with bars to the left or right of the \
text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn49429"

RPM_NAME = "texlive-vertbars-2023.201.1.0csvn49429-53.1.noarch.rpm"
RPM_HASH = "e00bc47e0bc4f0c1c2889b2fac28128193a2ad6b9cffea2eda61c9d7381a0c69768a6ddeb6f7cbf15aa686d8ab198d779731416a88c2defba66169922d8d49fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(vertbars.sty) texlive-vertbars"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(lineno.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
