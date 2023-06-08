SUMMARY = "Translations for package terminus"
DESCRIPTION = "Provides translations for the 'terminus' package."
LICENSE = "GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "terminus-lang-2.3.1-1.1.noarch.rpm"
RPM_HASH = "bcdc990824fcc9c940ec54133cb043315f4a0b0e7c048782ac82b1e054c622d84b0aefd0a69847fa17964b97d1859960c853e2c8d80755eaa5c1d88240cbf8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(terminus:es) terminus-lang terminus-lang-all"
RDEPENDS:${PN} += "terminus"

inherit rpm
