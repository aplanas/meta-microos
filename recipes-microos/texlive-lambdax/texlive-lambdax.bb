SUMMARY = "Use Lambda expression within LaTeX"
DESCRIPTION = "This package provides Lambda expressions. It is an interface to \
specify the parameters and replacement code of a \
document-command, and then to evaluate it with compatible \
arguments. Optionally, it can be used recursively."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn60278"

RPM_NAME = "texlive-lambdax-2023.201.1.1svn60278-55.1.noarch.rpm"
RPM_HASH = "55e79e72e5b98b56e7b12ae72c54c15ecfe0ce01cf10d2e175ef8505db27e7109a0c450a70c8408e2981d34ea9573be39dabb02fd6724ae2b2c80f4785bb1c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lambdax.sty) texlive-lambdax"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(keyparse.sty) tex(l3keys2e.sty) tex(xparse.sty) tex(xtemplate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
