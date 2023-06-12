SUMMARY = "Syntax highlighting for the Q# language"
DESCRIPTION = "The package provides syntax highlighting for the Q# language, a \
domain-specific language for quantum programming."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-2023.201.0.0.3.1901.1401svn49722-53.1.noarch.rpm"
RPM_HASH = "2c12757430588502c62e5a8c3a7ff04a10afbb06c0178820254af6975a1f39af7fe06f8f5b364a820c10fc94e260025806194ef9218fd80a0e22f65e9026c212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(qsharp.sty) \
texlive-qsharp"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(listings.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
