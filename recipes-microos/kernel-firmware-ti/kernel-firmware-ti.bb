SUMMARY = "Kernel firmware files for Texas Instruments wireless drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Texas Instruments wireless drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-ti-20230517-1.1.noarch.rpm"
RPM_HASH = "b7e18dc482e71b922b4988e06037b848b5cb6b1258c085055c0dbb23e0fb572264e8ae076dfa93ba2ef5847df0ba5f42a53d71b4a30c3bcb2cf5aa430ece0abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(ti-connectivity/TIInit_6.2.31.bts) firmware(ti-connectivity/TIInit_6.6.15.bts) firmware(ti-connectivity/TIInit_7.2.31.bts) firmware(ti-connectivity/wl1251-fw.bin) firmware(ti-connectivity/wl1251-nvs.bin) firmware(ti-connectivity/wl1271-fw-2.bin) firmware(ti-connectivity/wl1271-fw-ap.bin) firmware(ti-connectivity/wl1271-fw.bin) firmware(ti-connectivity/wl1271-nvs.bin) firmware(ti-connectivity/wl127x-fw-3.bin) firmware(ti-connectivity/wl127x-fw-4-mr.bin) firmware(ti-connectivity/wl127x-fw-4-plt.bin) firmware(ti-connectivity/wl127x-fw-4-sr.bin) firmware(ti-connectivity/wl127x-fw-5-mr.bin) firmware(ti-connectivity/wl127x-fw-5-plt.bin) firmware(ti-connectivity/wl127x-fw-5-sr.bin) firmware(ti-connectivity/wl127x-fw-plt-3.bin) firmware(ti-connectivity/wl127x-nvs.bin) firmware(ti-connectivity/wl128x-fw-3.bin) firmware(ti-connectivity/wl128x-fw-4-mr.bin) firmware(ti-connectivity/wl128x-fw-4-plt.bin) firmware(ti-connectivity/wl128x-fw-4-sr.bin) firmware(ti-connectivity/wl128x-fw-5-mr.bin) firmware(ti-connectivity/wl128x-fw-5-plt.bin) firmware(ti-connectivity/wl128x-fw-5-sr.bin) firmware(ti-connectivity/wl128x-fw-ap.bin) firmware(ti-connectivity/wl128x-fw-plt-3.bin) firmware(ti-connectivity/wl128x-fw.bin) firmware(ti-connectivity/wl128x-nvs.bin) firmware(ti-connectivity/wl12xx-nvs.bin) firmware(ti-connectivity/wl18xx-fw-2.bin) firmware(ti-connectivity/wl18xx-fw-3.bin) firmware(ti-connectivity/wl18xx-fw-4.bin) firmware(ti-connectivity/wl18xx-fw.bin) firmware(ti-keystone/ks2_qmss_pdsp_acc48_k2_le_1_0_0_9.bin) kernel-firmware-ti"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
