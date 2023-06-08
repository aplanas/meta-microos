SUMMARY = "Build tools to process tokens from an input stream"
DESCRIPTION = "The tokcycle package helps one to build tools to process tokens \
from an input stream. If a macro to process an arbitrary single \
token can be built, then tokcycle can provide a wrapper for \
cycling through an input stream (including macros, spaces, and \
groups) on a token-by-token basis, using the provided macro on \
each successive character. tokcycle characterizes each \
successive token in the input stream as a Character, a Group, a \
Macro, or a Space. Each of these token categories are processed \
with a unique directive, to bring about the desired effect of \
the token cycle. If condition flags are provided to identify \
active, implicit, and catcode-6 tokens as they are digested. \
The package provides a number of options for handling groups."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.42svn60320"

RPM_NAME = "texlive-tokcycle-2023.201.1.42svn60320-52.1.noarch.rpm"
RPM_HASH = "493e55cc83adb021545b5e1e593ec1f70a5f9a30fbb54633837ddaf7fd05330e169bcc806adc3c143d4aef7e30d58950b8307a30c7957efcd90aa06b0b3ac0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tokcycle.sty) tex(tokcycle.tex) texlive-tokcycle"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
