SUMMARY = "Use Computer Modern Typewriter bold font in ConTeXt"
DESCRIPTION = "The module makes provision for bold typewriter CM fonts, in \
ConTeXt. Such a font may be found in the Computer Modern 'extra \
bold' font set."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-cmttbf-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "7e7e16e5249c69e470adb7b3b896563220711d03f9078d8f1ba74e7d38401cb54f80fb2598540071b181149c615e091888540b28e236fe1f3bd0cf460dab950d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-cmttbf.tex) texlive-context-cmttbf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
