SUMMARY = "Trace which file loads which"
DESCRIPTION = "The package produces screen/log messages of the form '<current> \
INPUTTING <next>' reporting LaTeX input commands (<current> and \
<next> being file names). The message is indented to reflect \
the level of input nesting. Tracing may be turned on and off, \
and the unit of indentation may be adjusted. The implementation \
somewhat resembles those of packages FiNK and inputfile."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-2023.201.0.0.3svn28019-52.1.noarch.rpm"
RPM_HASH = "9e9cdd55d9d3e4dd2aa96112c314add938f940824cb742273143d3cdc93e5095b30596e5a51ec21111c8be10be599891d029e5d02efff0d74d3ed550fc95a488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(inputtrc.sty) texlive-inputtrc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
