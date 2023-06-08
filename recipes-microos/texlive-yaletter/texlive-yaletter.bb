SUMMARY = "Extremely flexible macros for letters, envelopes, and label sheets"
DESCRIPTION = "The yaletter class provides extremely configurable macros for \
typesetting letters in any conceivable style. It provides \
facilities for maintaining easily-accessible databases of \
letterheads and addresses for repeat use. It further provides \
easy macros for envelopes and for label sheets. Finally, it \
provides some nice defaults for a few of the more common styles \
and sizes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42830"

RPM_NAME = "texlive-yaletter-2023.201.1.1svn42830-52.1.noarch.rpm"
RPM_HASH = "2bc934ce456bcf3b7706c02ae4615a57d52a8515ef9be256359cd63c025434ce091b95e1e95a1a830085bac3a2775dce184744b08405b19e510af307f7e0ffe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(yaletter.cls) texlive-yaletter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fancyhdr.sty) tex(geometry.sty) tex(textpos.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
