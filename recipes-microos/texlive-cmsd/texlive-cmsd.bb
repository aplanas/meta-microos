SUMMARY = "Interfaces to the CM Sans Serif Bold fonts"
DESCRIPTION = "Thr purpose of the package is to provide an alternative \
interface to the CM Sans Serif boldface fonts. The EC (T1, \
Cork) encoded versions of the 'CM Sans Serif boldface extended' \
fonts differ considerably from the traditionally (OT1) encoded \
ones: at large sizes, >10pt, they have thinner strokes and are \
much wider. At 25pt they are hardly to be recognized as being \
'boldface'. This package attempts to make these T1 fonts look \
like the traditional ones did. You do not need any new fonts; \
the package just changes the way LaTeX makes use of the current \
ones."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18787"

RPM_NAME = "texlive-cmsd-2023.201.svn18787-53.1.noarch.rpm"
RPM_HASH = "df934720df3600159d0bf75703231b1d553df415a438c83ef6bafa4942cece3da66a7505db6ad2660b5e805f2ad7963bfa92c5cee7705aeca350effb3cc7111b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmsd.sty) tex(t1cmsd.fd) tex(ts1cmsd.fd) texlive-cmsd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
