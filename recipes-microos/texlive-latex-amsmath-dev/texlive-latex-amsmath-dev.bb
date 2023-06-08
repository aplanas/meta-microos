SUMMARY = "Development pre-release of the LaTeX amsmath bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX amsmath \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2023.201.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-amsmath-dev-2023.201.20230501_pre_release_0svn64899-55.1.noarch.rpm"
RPM_HASH = "f2170aa2948008f7ed8054716044b8d5211891c4cd406f092df45767a3e75c2cb5dc5098c089619fb9ac19fbd45ae9b9ac557d95676bfbd0a5c602a511404289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev(amsbsy.sty) texdev(amscd.sty) texdev(amsgen.sty) texdev(amsmath-2018-12-01.sty) texdev(amsmath.sty) texdev(amsopn.sty) texdev(amstex.sty) texdev(amstext.sty) texdev(amsxtra.sty) texlive-latex-amsmath-dev"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
