SUMMARY = "Jidian Wubi input method"
DESCRIPTION = "Jidian Wubi input methods. Current includes: \
Wubi 86."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-wubi-jidian-1.8.12-1.1.noarch.rpm"
RPM_HASH = "8c17875f490ad02f0d7313085e6492f24321875f1c34f909869bce2f43ebf1100ac1d9f2c242783a3d66f0783fa79ae6e5d0f37bcc43dfb489980720b3ad3080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wubi-jidian ibus-table-wubi locale(ibus:zh_CN)"
RDEPENDS:${PN} += "/bin/sh ibus-table"

inherit rpm
