SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the large (128x128 and larger) non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "oxygen5-icon-theme-large-5.106.0-1.1.noarch.rpm"
RPM_HASH = "99a21e760819a6371b5e6ce255b35c3ac156c819887d1a4bef2eb341f2b40208ecb1d9feeb7debb1a52ddbdae83f5f434c7c08a9fac65372d19b8c485bb7e967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-large \
oxygen5-icon-theme-large"
RDEPENDS:${PN} += "oxygen5-icon-theme"

inherit rpm
