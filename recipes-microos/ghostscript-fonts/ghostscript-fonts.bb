SUMMARY = "Ghostscript's free fonts"
DESCRIPTION = "Two sets of free fonts are supplied \
by Ghostscript: \
 \
Basic fonts for Ghostscript \
in the package ghostscript-fonts-std. \
 \
Optional Fonts for Ghostscript \
in the package ghostscript-fonts-other."
LICENSE = "GPL-2.0-only"

PV = "9.06"

RPM_NAME = "ghostscript-fonts-9.06-13.10.noarch.rpm"
RPM_HASH = "3c2febbe330a0479df391590d2a55b69dfca98d142c2d00acd682916d6fd667d1b8a1c3ffd6990784eeb2334731d758c70219aceb0ae0605be7f7cc3b138148e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostscript-fonts"
RDEPENDS:${PN} += ""

inherit rpm
