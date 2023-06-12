SUMMARY = "Translations for package kjs-devel"
DESCRIPTION = "Provides translations for the 'kjs-devel' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kjs-devel-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "51aa7d097fffffde77114eb2a801565aa50b549182329a66fb7858c699a79ce06bc1d0007ef09566aadf1f44f2c2413153f4233a83b43da743a045f6af0cdc40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjs-devel-lang kjs-devel-lang-all"
RDEPENDS:${PN} += "kjs-devel"

inherit rpm
