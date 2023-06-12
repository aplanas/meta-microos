SUMMARY = "Translations for package libconfuse"
DESCRIPTION = "Provides translations for the 'libconfuse' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3"

RPM_NAME = "libconfuse-lang-3.3-2.3.noarch.rpm"
RPM_HASH = "ba99152f7feb4385cc4106f4ff59b68cf84abc48e5cc4d3aa93ca531f089fba2b75e4853e7a0d3411d6f599c862864f03a65c899a83e885876f778f31d56e5b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libconfuse-lang \
libconfuse-lang-all \
locale(libconfuse:de) \
locale(libconfuse:fr) \
locale(libconfuse:sv)"
RDEPENDS:${PN} += "libconfuse2"

inherit rpm
