SUMMARY = "Kernel firmware files for Marvell network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-marvell-20230427-1.1.noarch.rpm"
RPM_HASH = "d4151be8e6582669e1061b27941e1506a009e5323429c3d22801f8af808a8c00bfc4b82cf4193ba99c4f8ec922f93b892d52bd8b910244856296d64aae885f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(lbtf_usb.bin) firmware(libertas/cf8381.bin) firmware(libertas/cf8381_helper.bin) firmware(libertas/cf8385.bin) firmware(libertas/cf8385_helper.bin) firmware(libertas/gspi8682.bin) firmware(libertas/gspi8682_helper.bin) firmware(libertas/gspi8686_v9.bin) firmware(libertas/gspi8686_v9_helper.bin) firmware(libertas/gspi8688.bin) firmware(libertas/gspi8688_helper.bin) firmware(libertas/lbtf_sdio.bin) firmware(libertas/sd8385.bin) firmware(libertas/sd8385_helper.bin) firmware(libertas/sd8682.bin) firmware(libertas/sd8682_helper.bin) firmware(libertas/sd8686_v8.bin) firmware(libertas/sd8686_v8_helper.bin) firmware(libertas/sd8686_v9.bin) firmware(libertas/sd8686_v9_helper.bin) firmware(libertas/sd8688.bin) firmware(libertas/sd8688_helper.bin) firmware(libertas/usb8388_olpc.bin) firmware(libertas/usb8388_v5.bin) firmware(libertas/usb8388_v9.bin) firmware(libertas/usb8682.bin) firmware(mrvl/sd8688.bin) firmware(mrvl/sd8688_helper.bin) firmware(mwl8k/fmimage_8366.fw) firmware(mwl8k/fmimage_8366_ap-1.fw) firmware(mwl8k/fmimage_8366_ap-2.fw) firmware(mwl8k/fmimage_8366_ap-3.fw) firmware(mwl8k/fmimage_8687.fw) firmware(mwl8k/fmimage_8764_ap-1.fw) firmware(mwl8k/helper_8366.fw) firmware(mwl8k/helper_8687.fw) firmware(mwlwifi/88W8864.bin) firmware(mwlwifi/88W8897.bin) kernel-firmware-marvell"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
