SUMMARY = "Kernel firmware files for Mediatek network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Mediatek network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-mediatek-20230427-1.1.noarch.rpm"
RPM_HASH = "2b924333e75b701084b4ddafae3eed3f7d84c159556c9676609f64fde33a1b55570de1b78f6f12d7189d2ce6c7d89d79c991a2a8936a51d47252e73240dac81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(mediatek/BT_RAM_CODE_MT7922_1_1_hdr.bin) firmware(mediatek/BT_RAM_CODE_MT7961_1_2_hdr.bin) firmware(mediatek/WIFI_MT7922_patch_mcu_1_1_hdr.bin) firmware(mediatek/WIFI_MT7961_patch_mcu_1_2_hdr.bin) firmware(mediatek/WIFI_RAM_CODE_MT7922_1.bin) firmware(mediatek/WIFI_RAM_CODE_MT7961_1.bin) firmware(mediatek/mt7601u.bin) firmware(mediatek/mt7610e.bin) firmware(mediatek/mt7610u.bin) firmware(mediatek/mt7615_cr4.bin) firmware(mediatek/mt7615_n9.bin) firmware(mediatek/mt7615_rom_patch.bin) firmware(mediatek/mt7622_n9.bin) firmware(mediatek/mt7622_rom_patch.bin) firmware(mediatek/mt7622pr2h.bin) firmware(mediatek/mt7650.bin) firmware(mediatek/mt7650e.bin) firmware(mediatek/mt7662.bin) firmware(mediatek/mt7662_rom_patch.bin) firmware(mediatek/mt7662u.bin) firmware(mediatek/mt7662u_rom_patch.bin) firmware(mediatek/mt7663_n9_rebb.bin) firmware(mediatek/mt7663_n9_v3.bin) firmware(mediatek/mt7663pr2h.bin) firmware(mediatek/mt7663pr2h_rebb.bin) firmware(mediatek/mt7668pr2h.bin) firmware(mediatek/mt7915_eeprom.bin) firmware(mediatek/mt7915_eeprom_dbdc.bin) firmware(mediatek/mt7915_rom_patch.bin) firmware(mediatek/mt7915_wa.bin) firmware(mediatek/mt7915_wm.bin) firmware(mediatek/mt7916_eeprom.bin) firmware(mediatek/mt7916_rom_patch.bin) firmware(mediatek/mt7916_wa.bin) firmware(mediatek/mt7916_wm.bin) firmware(mediatek/mt7981_rom_patch.bin) firmware(mediatek/mt7981_wa.bin) firmware(mediatek/mt7981_wm.bin) firmware(mediatek/mt7981_wo.bin) firmware(mediatek/mt7986_eeprom_mt7975_dual.bin) firmware(mediatek/mt7986_eeprom_mt7976.bin) firmware(mediatek/mt7986_eeprom_mt7976_dbdc.bin) firmware(mediatek/mt7986_eeprom_mt7976_dual.bin) firmware(mediatek/mt7986_rom_patch.bin) firmware(mediatek/mt7986_rom_patch_mt7975.bin) firmware(mediatek/mt7986_wa.bin) firmware(mediatek/mt7986_wm.bin) firmware(mediatek/mt7986_wm_mt7975.bin) firmware(mediatek/mt7986_wo_0.bin) firmware(mediatek/mt7986_wo_1.bin) firmware(mediatek/mt8183/scp.img) firmware(mediatek/mt8186/scp.img) firmware(mediatek/mt8192/scp.img) firmware(mediatek/mt8195/scp.img) firmware(mt7601u.bin) firmware(mt7650.bin) firmware(mt7662.bin) firmware(mt7662_rom_patch.bin) kernel-firmware-mediatek ralink-firmware"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
