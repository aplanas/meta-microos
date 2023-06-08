SUMMARY = "MPRIS api for lua"
DESCRIPTION = "MPRIS api for lua"
LICENSE = "MIT"

PV = "0.0+git20191025.2b12542"

RPM_NAME = "lua53-lua-mpris-0.0+git20191025.2b12542-4.1.aarch64.rpm"
RPM_HASH = "9b3d195724f30677356cd00f6967bf7cca2308dda36afd83c18414625b96f78c320154f8e6337d7722b172448b9426c97138f98f0b36a5065562d5054e718fbc"

RPROVIDES:${PN} += "lua53-lua-mpris lua53-lua-mpris(aarch-64)"
RDEPENDS:${PN} += "lua53 lua53-lua-dbus"

inherit rpm
