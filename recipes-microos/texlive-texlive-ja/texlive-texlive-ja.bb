SUMMARY = "TeX Live manual (Japanese)"
DESCRIPTION = "The texlive-ja package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66482"

RPM_NAME = "texlive-texlive-ja-2023.201.svn66482-54.1.noarch.rpm"
RPM_HASH = "cf76ab8bf590f63afcc224f728eb3b3e42e80200c1321273e444bee1bddfa4313b7f2f1dd6e51d067acfc0d3975ad0a713c644a613ad7eff5c01ff04d56b17ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-ja"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
