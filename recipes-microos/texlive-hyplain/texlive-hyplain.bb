SUMMARY = "Basic support for multiple languages in Plain TeX"
DESCRIPTION = "The package offers a means to set up hyphenation suitable for \
several languages and/or dialects, and to select them or switch \
between them while typesetting."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hyplain-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "c12dde6d1ae578ee72400d3e82b4b8491618d031889d8d51b732a26599bc11cbcc0677be7f77eef08f5c98fa98e39bc251ce1286a53d1e139a97fda924ef2c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hylang.tex) tex(hyplain.tex) tex(hyrules.tex) texlive-hyplain"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
