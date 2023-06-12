SUMMARY = "Kernel firmware files for Marvell WiFi fullmac drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell WiFi fullmac drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-mwifiex-20230517-1.1.noarch.rpm"
RPM_HASH = "49899ac47ef3ddb9eee9c89a7b2dc8a7adc7fc6af004e008629df551d03fbc5703e94248ccd2ea9cc5a31bc4cb5956f35f342ea31094607b3ec4ca24fcc5a9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(mrvl/pcie8897_uapsta.bin) firmware(mrvl/pcie8997_wlan_v4.bin) firmware(mrvl/pcieuart8997_combo_v4.bin) firmware(mrvl/pcieusb8997_combo_v4.bin) firmware(mrvl/sd8787_uapsta.bin) firmware(mrvl/sd8797_uapsta.bin) firmware(mrvl/sd8801_uapsta.bin) firmware(mrvl/sd8887_uapsta.bin) firmware(mrvl/sd8897_uapsta.bin) firmware(mrvl/sdsd8977_combo_v2.bin) firmware(mrvl/sdsd8997_combo_v4.bin) firmware(mrvl/usb8766_uapsta.bin) firmware(mrvl/usb8797_uapsta.bin) firmware(mrvl/usb8801_uapsta.bin) firmware(mrvl/usb8897_uapsta.bin) firmware(mrvl/usbusb8997_combo_v4.bin) kernel-firmware-mwifiex"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
