SUMMARY = "Kernel firmware files for Marvell WiFi fullmac drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell WiFi fullmac drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-mwifiex-20230427-1.1.noarch.rpm"
RPM_HASH = "2cdd982b92dce511f381e122d1350283838c0d0b96f5ce20c5da4a52f10b035e58329fb0a6952d1850a9b90ddbe0aceb79c2fbc7e60d4c3dd9fcd0364d57d124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(mrvl/pcie8897_uapsta.bin) firmware(mrvl/pcie8997_wlan_v4.bin) firmware(mrvl/pcieuart8997_combo_v4.bin) firmware(mrvl/pcieusb8997_combo_v4.bin) firmware(mrvl/sd8787_uapsta.bin) firmware(mrvl/sd8797_uapsta.bin) firmware(mrvl/sd8801_uapsta.bin) firmware(mrvl/sd8887_uapsta.bin) firmware(mrvl/sd8897_uapsta.bin) firmware(mrvl/sdsd8977_combo_v2.bin) firmware(mrvl/sdsd8997_combo_v4.bin) firmware(mrvl/usb8766_uapsta.bin) firmware(mrvl/usb8797_uapsta.bin) firmware(mrvl/usb8801_uapsta.bin) firmware(mrvl/usb8897_uapsta.bin) firmware(mrvl/usbusb8997_combo_v4.bin) kernel-firmware-mwifiex"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
