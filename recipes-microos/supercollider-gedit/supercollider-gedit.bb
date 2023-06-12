SUMMARY = "SuperCollider support for GEdit"
DESCRIPTION = "SuperCollider support for the GEdit text editor."
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-gedit-3.13.0-1.3.aarch64.rpm"
RPM_HASH = "d8dbe8ed91880398f77c03802a89ffe5a3398b169de148f0b0fe9773c444ac7886c122d77ead381ec5046a34d132add49fe304632a9eb929515494c6f2b70272"

RPROVIDES:${PN} += "supercollider-gedit \
supercollider-gedit(aarch-64)"
RDEPENDS:${PN} += "supercollider"

inherit rpm
