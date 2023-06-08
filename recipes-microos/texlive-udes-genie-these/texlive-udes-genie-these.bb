SUMMARY = "A thesis class file for the Faculte de genie at the Universite de Sherbrooke"
DESCRIPTION = "The udes-genie-these class can be used for Ph.D. theses, \
master's theses and project definitions at the Faculte de genie \
of the Universite de Sherbrooke (Quebec, Canada). The class \
file is coherent with the latest version of the Protocole de \
redaction aux etudes superieures which is available on the \
faculte's intranet. The class file documentation is in French, \
the language of the typical user at the Universite de \
Sherbrooke. An example of use is also distributed with the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn65039"

RPM_NAME = "texlive-udes-genie-these-2023.201.3.0.1svn65039-53.1.noarch.rpm"
RPM_HASH = "5399faf4371ffbb9a27ca4a024745db2153339110331cea8dd451e587c8c75cf2b8d8c03ce16466258f9d543ddb4cbe8d301a42e5bde6b1918f64ab10aa9e994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(udes-genie-these.cls) texlive-udes-genie-these"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(book.cls) tex(caption.sty) tex(fancyhdr.sty) tex(flafter.sty) tex(geometry.sty) tex(l3keys2e.sty) tex(parskip.sty) tex(setspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
