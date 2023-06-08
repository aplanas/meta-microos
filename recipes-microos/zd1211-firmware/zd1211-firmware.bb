SUMMARY = "Firmware for ZD1211 USB WLAN sticks"
DESCRIPTION = "Firmware for USB WLAN sticks based on the ZyDAS ZD1211 chip"
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "zd1211-firmware-1.5-2.7.noarch.rpm"
RPM_HASH = "d89d47dd60d46f7a942804e6212b89102d4070ce41d66ba8c6c210a0f19a409cdcaf13084989b20776f93e2b73a89fcedae220948ac1897d2438619cade2aae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(zd1211/zd1211_ub) firmware(zd1211/zd1211_uph) firmware(zd1211/zd1211_uphm) firmware(zd1211/zd1211_uphr) firmware(zd1211/zd1211_ur) firmware(zd1211/zd1211b_ub) firmware(zd1211/zd1211b_uph) firmware(zd1211/zd1211b_uphm) firmware(zd1211/zd1211b_uphr) firmware(zd1211/zd1211b_ur) zd1211-firmware"
RDEPENDS:${PN} += ""

inherit rpm
