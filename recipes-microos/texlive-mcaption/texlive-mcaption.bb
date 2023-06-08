SUMMARY = "Put captions in the margin"
DESCRIPTION = "The mcaption package provides an mcaption environment which \
puts figure or table captions in the margin. The package works \
with the standard classes and with the KOMA-Script document \
classes scrartcl, scrreprt and scrbook. The package requires \
the changepage package."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-mcaption-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "bd2fccfafb72fbc99d7a33ac1dc567e21d6f7c6c1011b50f0d9b32775d76fcd42aa02bfee2c08ee1a11be1788659f5f65965be9115019aa7156f5b020383ff88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mcaption.sty) texlive-mcaption"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(changepage.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
