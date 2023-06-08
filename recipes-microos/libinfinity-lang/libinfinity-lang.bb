SUMMARY = "Translations for package libinfinity"
DESCRIPTION = "Provides translations for the 'libinfinity' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-lang-0.7.2-4.6.noarch.rpm"
RPM_HASH = "6b747ca25f0635dc630c5e370921c6a9cbacbe6c150ba8ebdf8ab305982c523be50de8f3e636dcabc712cc51541a7250821e8db8a047bdcec0055e6b39223c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libinfinity-lang libinfinity-lang-all locale(libinfinity:ca) locale(libinfinity:de)"
RDEPENDS:${PN} += "libinfinity"

inherit rpm
