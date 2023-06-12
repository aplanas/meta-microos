SUMMARY = "Kernel firmware files for Mediatek network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Mediatek network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-mediatek-20230517-1.1.noarch.rpm"
RPM_HASH = "e3515584bcba903b65743788082b5e07845ae7f2dfd8084f24d160152f27b53908efb6486503ac68e2c1bacc7bb99328a5807c56056be60aff1aa0c018b56750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(mediatek/BT_RAM_CODE_MT7922_1_1_hdr.bin) firmware(mediatek/BT_RAM_CODE_MT7961_1_2_hdr.bin) firmware(mediatek/WIFI_MT7922_patch_mcu_1_1_hdr.bin) firmware(mediatek/WIFI_MT7961_patch_mcu_1_2_hdr.bin) firmware(mediatek/WIFI_RAM_CODE_MT7922_1.bin) firmware(mediatek/WIFI_RAM_CODE_MT7961_1.bin) firmware(mediatek/mt7601u.bin) firmware(mediatek/mt7610e.bin) firmware(mediatek/mt7610u.bin) firmware(mediatek/mt7615_cr4.bin) firmware(mediatek/mt7615_n9.bin) firmware(mediatek/mt7615_rom_patch.bin) firmware(mediatek/mt7622_n9.bin) firmware(mediatek/mt7622_rom_patch.bin) firmware(mediatek/mt7622pr2h.bin) firmware(mediatek/mt7650.bin) firmware(mediatek/mt7650e.bin) firmware(mediatek/mt7662.bin) firmware(mediatek/mt7662_rom_patch.bin) firmware(mediatek/mt7662u.bin) firmware(mediatek/mt7662u_rom_patch.bin) firmware(mediatek/mt7663_n9_rebb.bin) firmware(mediatek/mt7663_n9_v3.bin) firmware(mediatek/mt7663pr2h.bin) firmware(mediatek/mt7663pr2h_rebb.bin) firmware(mediatek/mt7668pr2h.bin) firmware(mediatek/mt7915_eeprom.bin) firmware(mediatek/mt7915_eeprom_dbdc.bin) firmware(mediatek/mt7915_rom_patch.bin) firmware(mediatek/mt7915_wa.bin) firmware(mediatek/mt7915_wm.bin) firmware(mediatek/mt7916_eeprom.bin) firmware(mediatek/mt7916_rom_patch.bin) firmware(mediatek/mt7916_wa.bin) firmware(mediatek/mt7916_wm.bin) firmware(mediatek/mt7981_rom_patch.bin) firmware(mediatek/mt7981_wa.bin) firmware(mediatek/mt7981_wm.bin) firmware(mediatek/mt7981_wo.bin) firmware(mediatek/mt7986_eeprom_mt7975_dual.bin) firmware(mediatek/mt7986_eeprom_mt7976.bin) firmware(mediatek/mt7986_eeprom_mt7976_dbdc.bin) firmware(mediatek/mt7986_eeprom_mt7976_dual.bin) firmware(mediatek/mt7986_rom_patch.bin) firmware(mediatek/mt7986_rom_patch_mt7975.bin) firmware(mediatek/mt7986_wa.bin) firmware(mediatek/mt7986_wm.bin) firmware(mediatek/mt7986_wm_mt7975.bin) firmware(mediatek/mt7986_wo_0.bin) firmware(mediatek/mt7986_wo_1.bin) firmware(mediatek/mt8183/scp.img) firmware(mediatek/mt8186/scp.img) firmware(mediatek/mt8192/scp.img) firmware(mediatek/mt8195/scp.img) firmware(mt7601u.bin) firmware(mt7650.bin) firmware(mt7662.bin) firmware(mt7662_rom_patch.bin) kernel-firmware-mediatek ralink-firmware"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
