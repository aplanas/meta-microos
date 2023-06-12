SUMMARY = "Define new versions of \\verb, including short verb versions"
DESCRIPTION = "The package allows the definition of \\verb variants which add \
TeX code before and after the verbatim text (e.g., quotes or \
surrounding \\fbox{}). When used together with the shortvrb \
package it allows the definition of short verbatim characters \
which use this package's variant instead of the normal \\verb. \
In addition, it is possible to collect an argument verbatim to \
either typeset or write it into a file. The \\Verbdef command \
defines verbatim text to a macro which can later be used to \
write the verbatim text to a file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6asvn64833"

RPM_NAME = "texlive-newverbs-2023.201.1.6asvn64833-54.1.noarch.rpm"
RPM_HASH = "59ca1706e6e3993a51ae52d7f29a434270d571d14ca95058c0e68127c2eef056a3faabbfe1080571e05fe32a9b4534eda0fdd7c4e937ebb97ba184112b20647d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(newverbs.sty) \
texlive-newverbs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(shortvrb.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
