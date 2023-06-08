SUMMARY = "Basic scheme (plain and latex)"
DESCRIPTION = "This is the basic TeX Live scheme: it is a small set of files \
sufficient to typeset plain TeX or LaTeX documents in \
PostScript or PDF, using the Computer Modern fonts. This scheme \
corresponds to collection-basic and collection-latex."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54191"

RPM_NAME = "texlive-scheme-basic-2023.201.svn54191-56.1.noarch.rpm"
RPM_HASH = "265a33c723faca3e97a091f3d4ec2148c9c4b39bc59af6efa70cf8f7dedfc1a337be8ee3b4023c7ccc86645317e8335ec541342ee44b7da7b0359f6923be429d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-basic"
RDEPENDS:${PN} += "texlive-collection-basic texlive-collection-latex"

inherit rpm
