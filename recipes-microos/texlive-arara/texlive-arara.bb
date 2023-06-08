SUMMARY = "Automation of LaTeX compilation"
DESCRIPTION = "Arara is comparable with other well-known compilation tools \
like latexmk and rubber. The key difference is that arara \
determines its actions from metadata in the source code, rather \
than relying on indirect resources, such as log file analysis. \
Arara requires a Java virtual machine."
LICENSE = "BSD-3-Clause"

PV = "2023.201.7.0.4svn63760"

RPM_NAME = "texlive-arara-2023.201.7.0.4svn63760-54.1.noarch.rpm"
RPM_HASH = "d2abe872eabe20d14ca7ebf05352f9e91afa347acb84643b71adea8a7009b51b208c16740130217c656ff1f15cd70f8b09777d7c0d1d757eb9898a69e498359f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arara.jar) texlive-arara"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep java sed texlive texlive-arara-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
