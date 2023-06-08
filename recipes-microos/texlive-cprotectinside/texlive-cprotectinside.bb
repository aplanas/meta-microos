SUMMARY = "Use cprotect arbitrarily nested"
DESCRIPTION = "This package extends the cprotect package to allow users to use \
verbatim-like commands inside arbitrary parameters."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.0.0svn63833"

RPM_NAME = "texlive-cprotectinside-2023.204.0.0.0.0svn63833-54.1.noarch.rpm"
RPM_HASH = "fc26eee9b13141eccf0e747bf10d85a27726520015090fbe45837a63dce9c0104cba63d11fddef137a0515ecaba3a36677f8cb79e0342577fcdbabf220c3d74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cprotectinside.sty) texlive-cprotectinside"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
