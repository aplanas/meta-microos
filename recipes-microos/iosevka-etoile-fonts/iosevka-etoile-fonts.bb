SUMMARY = "Iosevka in quasi-proportional slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Etoile typeface (quasi-proportional, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-etoile-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "7a15b4d9fafadd3e49adba74d91f193b4a46ce07a9c2b15c7301438f2f7df9c5c59688a095474e7438f3a1b30bcc230a9da12d58dc187c7e866f4f287d8a7998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-etoile-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
