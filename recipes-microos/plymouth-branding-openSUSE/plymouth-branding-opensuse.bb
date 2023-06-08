SUMMARY = "openSUSE Tumbleweed branding for Plymouth bootsplash"
DESCRIPTION = "openSUSE Tumbleweed branding for the plymouth bootsplash"
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230227"

RPM_NAME = "plymouth-branding-openSUSE-84.87.20230227-1.1.noarch.rpm"
RPM_HASH = "30dba43cd37d58f20cae7fb44f18086d2d34211d8b78a27bfd63c68d72c08267df190837c718a42d145c79a572c97d7849c419cec5d980d0f396dfd215699b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding plymouth-branding-openSUSE"
RDEPENDS:${PN} += "plymouth-scripts plymouth-theme-bgrt"

inherit rpm
