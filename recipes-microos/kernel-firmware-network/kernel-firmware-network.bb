SUMMARY = "Kernel firmware files for various network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-network-20230517-1.1.noarch.rpm"
RPM_HASH = "88b68854f00a33d15235a5c96b80954b0b08edbf15f8c8952d1e5a86ac9b444ca85894894de001ae06fd8a6bef6d8ca76fbe2f78740cb20b60501cf549f1f2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(3com/typhoon.bin) \
firmware(acenic/tg1.bin) \
firmware(acenic/tg2.bin) \
firmware(adaptec/starfire_rx.bin) \
firmware(adaptec/starfire_tx.bin) \
firmware(agere_ap_fw.bin) \
firmware(agere_sta_fw.bin) \
firmware(atmel/wilc1000_ap_fw.bin) \
firmware(atmel/wilc1000_fw.bin) \
firmware(atmel/wilc1000_p2p_fw.bin) \
firmware(atmel/wilc1000_wifi_firmware-1.bin) \
firmware(atmel/wilc1000_wifi_firmware.bin) \
firmware(e100/d101m_ucode.bin) \
firmware(e100/d101s_ucode.bin) \
firmware(e100/d102e_ucode.bin) \
firmware(intel/ice/ddp-comms/ice_comms-1.3.31.0.pkg) \
firmware(intel/ice/ddp-wireless_edge/ice_wireless_edge-1.3.7.0.pkg) \
firmware(intel/ice/ddp/ice-1.3.30.0.pkg) \
firmware(intel/ice/ddp/ice.pkg) \
firmware(myri10ge_eth_big_z8e.dat) \
firmware(myri10ge_eth_z8e.dat) \
firmware(myri10ge_ethp_big_z8e.dat) \
firmware(myri10ge_ethp_z8e.dat) \
firmware(myri10ge_rss_eth_big_z8e.dat) \
firmware(myri10ge_rss_eth_z8e.dat) \
firmware(myri10ge_rss_ethp_big_z8e.dat) \
firmware(myri10ge_rss_ethp_z8e.dat) \
firmware(myricom/lanai.bin) \
firmware(phanfw.bin) \
firmware(rt2561.bin) \
firmware(rt2561s.bin) \
firmware(rt2661.bin) \
firmware(sdd_sagrad_1091_1098.bin) \
firmware(slicoss/gbdownload.sys) \
firmware(slicoss/gbrcvucode.sys) \
firmware(slicoss/oasisdbgdownload.sys) \
firmware(slicoss/oasisdownload.sys) \
firmware(slicoss/oasisrcvucode.sys) \
firmware(sxg/saharadbgdownloadB.sys) \
firmware(sxg/saharadownloadB.sys) \
firmware(tehuti/bdx.bin) \
firmware(tigon/tg3.bin) \
firmware(tigon/tg357766.bin) \
firmware(tigon/tg3_tso.bin) \
firmware(tigon/tg3_tso5.bin) \
firmware(vxge/X3fw-pxe.ncf) \
firmware(vxge/X3fw.ncf) \
firmware(wsm_22.bin) \
kernel-firmware-network"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
