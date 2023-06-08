SUMMARY = "Lua Files for Keybinder"
DESCRIPTION = "This package contains Lua files for applications based on keybinder."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.3.1"

RPM_NAME = "keybinder-lua-0.3.1-3.6.aarch64.rpm"
RPM_HASH = "88e523cc86c48dab70e9e365365f0a61e898df5c2953b23802f770ade510cfbe1690dbf573a0ac4acab8d330cc276fa5e96c61ee6b9f236e0167f541427a77cf"

RPROVIDES:${PN} += "keybinder-lua keybinder-lua(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libkeybinder.so.0()(64bit) libkeybinder0"

inherit rpm
