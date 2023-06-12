SUMMARY = "Kernel firmware files for Marvell network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-marvell-20230517-1.1.noarch.rpm"
RPM_HASH = "9d6ef38bdf3196efc1541c8886073b3e8e3460d72e03de43a794dc32728de43c1dc68fda92dd8056c9f4c28399f0f740b3acf54a60814e134a5b1b1d3e0adb8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(lbtf_usb.bin) \
firmware(libertas/cf8381.bin) \
firmware(libertas/cf8381_helper.bin) \
firmware(libertas/cf8385.bin) \
firmware(libertas/cf8385_helper.bin) \
firmware(libertas/gspi8682.bin) \
firmware(libertas/gspi8682_helper.bin) \
firmware(libertas/gspi8686_v9.bin) \
firmware(libertas/gspi8686_v9_helper.bin) \
firmware(libertas/gspi8688.bin) \
firmware(libertas/gspi8688_helper.bin) \
firmware(libertas/lbtf_sdio.bin) \
firmware(libertas/sd8385.bin) \
firmware(libertas/sd8385_helper.bin) \
firmware(libertas/sd8682.bin) \
firmware(libertas/sd8682_helper.bin) \
firmware(libertas/sd8686_v8.bin) \
firmware(libertas/sd8686_v8_helper.bin) \
firmware(libertas/sd8686_v9.bin) \
firmware(libertas/sd8686_v9_helper.bin) \
firmware(libertas/sd8688.bin) \
firmware(libertas/sd8688_helper.bin) \
firmware(libertas/usb8388_olpc.bin) \
firmware(libertas/usb8388_v5.bin) \
firmware(libertas/usb8388_v9.bin) \
firmware(libertas/usb8682.bin) \
firmware(mrvl/sd8688.bin) \
firmware(mrvl/sd8688_helper.bin) \
firmware(mwl8k/fmimage_8366.fw) \
firmware(mwl8k/fmimage_8366_ap-1.fw) \
firmware(mwl8k/fmimage_8366_ap-2.fw) \
firmware(mwl8k/fmimage_8366_ap-3.fw) \
firmware(mwl8k/fmimage_8687.fw) \
firmware(mwl8k/fmimage_8764_ap-1.fw) \
firmware(mwl8k/helper_8366.fw) \
firmware(mwl8k/helper_8687.fw) \
firmware(mwlwifi/88W8864.bin) \
firmware(mwlwifi/88W8897.bin) \
kernel-firmware-marvell"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
