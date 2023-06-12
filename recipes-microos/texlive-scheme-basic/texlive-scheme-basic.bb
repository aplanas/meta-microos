SUMMARY = "Basic scheme (plain and latex)"
DESCRIPTION = "This is the basic TeX Live scheme: it is a small set of files \
sufficient to typeset plain TeX or LaTeX documents in \
PostScript or PDF, using the Computer Modern fonts. This scheme \
corresponds to collection-basic and collection-latex."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-basic-2023.208.svn54191-58.1.noarch.rpm"
RPM_HASH = "3f6d93fa05c1d0498ef53ec6ea4e56f189b10e1bf51bd5abe8feb50ff4c542d27ea2ceb7da28b1f50ed9c0cb986e308afaf5bc05aa479ffec50de30be025f579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-basic"
RDEPENDS:${PN} += "texlive-collection-basic texlive-collection-latex"

inherit rpm
