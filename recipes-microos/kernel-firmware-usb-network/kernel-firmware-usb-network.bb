SUMMARY = "Kernel firmware files for various USB WiFi / Ethernet drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various USB WiFi / Ethernet drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-usb-network-20230427-1.1.noarch.rpm"
RPM_HASH = "f19a21589cb9aa62c986cf51301164bb92445e83fad11ef6f74d363885a72ba2afb604c1f1db27d23f40189a9ea35c6bf58fe8721d4602ba25f4d8f8f6f60239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(atusb/atusb-0.2.dfu) firmware(atusb/atusb-0.3.dfu) firmware(atusb/rzusb-0.3.bin) firmware(kaweth/new_code.bin) firmware(kaweth/new_code_fix.bin) firmware(kaweth/trigger_code.bin) firmware(kaweth/trigger_code_fix.bin) firmware(rsi/rs9113_ap_bt_dual_mode.rps) firmware(rsi/rs9113_wlan_bt_dual_mode.rps) firmware(rsi/rs9113_wlan_qspi.rps) firmware(rsi/rs9116_wlan.rps) firmware(rsi/rs9116_wlan_bt_classic.rps) firmware(rsi_91x.fw) firmware(rt73.bin) firmware(vntwusb.fw) kernel-firmware-usb-network"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
