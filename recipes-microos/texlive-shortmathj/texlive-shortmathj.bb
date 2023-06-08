SUMMARY = "Automatically shortify titles of mathematical journals"
DESCRIPTION = "This small dummy package just contains a simple list of full \
and short journal names aswritten in AMS standard: \
https://mathscinet.ams.org/msnhtml/serials.pdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.0svn54407"

RPM_NAME = "texlive-shortmathj-2023.201.0.0.5.0svn54407-53.1.noarch.rpm"
RPM_HASH = "083629cf70d89607fddf11410b0f07066ffd2ee87c3f8ffef84adbef5eecd995ea79e27f6b0ff9400aed67669291a4b559c811d329f56eebccd97ad0365e308f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(shortmathj.sty) texlive-shortmathj"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
