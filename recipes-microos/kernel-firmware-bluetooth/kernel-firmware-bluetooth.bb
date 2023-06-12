SUMMARY = "Kernel firmware files for various Bluetooth drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various Bluetooth drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-bluetooth-20230517-1.1.noarch.rpm"
RPM_HASH = "38a7f9e06aec4d84c68769d320550fc67b829459ffe308c7e28c3a0b92688aa038c4eaeea80c7fb56d218dcc13fb90b2ad2ed8581d374288afed1a56a0fc64bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(intel/ibt-0040-0041.ddc) firmware(intel/ibt-0040-0041.sfi) firmware(intel/ibt-0040-1020.ddc) firmware(intel/ibt-0040-1020.sfi) firmware(intel/ibt-0040-2120.ddc) firmware(intel/ibt-0040-2120.sfi) firmware(intel/ibt-0040-4150.ddc) firmware(intel/ibt-0040-4150.sfi) firmware(intel/ibt-0041-0041.ddc) firmware(intel/ibt-0041-0041.sfi) firmware(intel/ibt-1040-0041.ddc) firmware(intel/ibt-1040-0041.sfi) firmware(intel/ibt-1040-1020.ddc) firmware(intel/ibt-1040-1020.sfi) firmware(intel/ibt-1040-2120.ddc) firmware(intel/ibt-1040-2120.sfi) firmware(intel/ibt-1040-4150.ddc) firmware(intel/ibt-1040-4150.sfi) firmware(intel/ibt-11-5.ddc) firmware(intel/ibt-11-5.sfi) firmware(intel/ibt-12-16.ddc) firmware(intel/ibt-12-16.sfi) firmware(intel/ibt-17-0-1.ddc) firmware(intel/ibt-17-0-1.sfi) firmware(intel/ibt-17-1.ddc) firmware(intel/ibt-17-1.sfi) firmware(intel/ibt-17-16-1.ddc) firmware(intel/ibt-17-16-1.sfi) firmware(intel/ibt-17-2.ddc) firmware(intel/ibt-17-2.sfi) firmware(intel/ibt-18-0-1.ddc) firmware(intel/ibt-18-0-1.sfi) firmware(intel/ibt-18-1.ddc) firmware(intel/ibt-18-1.sfi) firmware(intel/ibt-18-16-1.ddc) firmware(intel/ibt-18-16-1.sfi) firmware(intel/ibt-18-2.ddc) firmware(intel/ibt-18-2.sfi) firmware(intel/ibt-19-0-0.ddc) firmware(intel/ibt-19-0-0.sfi) firmware(intel/ibt-19-0-1.ddc) firmware(intel/ibt-19-0-1.sfi) firmware(intel/ibt-19-0-3.ddc) firmware(intel/ibt-19-0-3.sfi) firmware(intel/ibt-19-0-4.ddc) firmware(intel/ibt-19-0-4.sfi) firmware(intel/ibt-19-16-4.ddc) firmware(intel/ibt-19-16-4.sfi) firmware(intel/ibt-19-240-1.ddc) firmware(intel/ibt-19-240-1.sfi) firmware(intel/ibt-19-240-4.ddc) firmware(intel/ibt-19-240-4.sfi) firmware(intel/ibt-19-32-0.ddc) firmware(intel/ibt-19-32-0.sfi) firmware(intel/ibt-19-32-1.ddc) firmware(intel/ibt-19-32-1.sfi) firmware(intel/ibt-19-32-4.ddc) firmware(intel/ibt-19-32-4.sfi) firmware(intel/ibt-20-0-3.ddc) firmware(intel/ibt-20-0-3.sfi) firmware(intel/ibt-20-1-3.ddc) firmware(intel/ibt-20-1-3.sfi) firmware(intel/ibt-20-1-4.ddc) firmware(intel/ibt-20-1-4.sfi) firmware(intel/ibt-hw-37.7.10-fw-1.0.1.2d.d.bseq) firmware(intel/ibt-hw-37.7.10-fw-1.0.2.3.d.bseq) firmware(intel/ibt-hw-37.7.10-fw-1.80.1.2d.d.bseq) firmware(intel/ibt-hw-37.7.10-fw-1.80.2.3.d.bseq) firmware(intel/ibt-hw-37.7.bseq) firmware(intel/ibt-hw-37.8.10-fw-1.10.2.27.d.bseq) firmware(intel/ibt-hw-37.8.10-fw-1.10.3.11.e.bseq) firmware(intel/ibt-hw-37.8.10-fw-22.50.19.14.f.bseq) firmware(intel/ibt-hw-37.8.bseq) firmware(qca/crbtfw21.tlv) firmware(qca/crbtfw32.tlv) firmware(qca/crnv21.bin) firmware(qca/crnv32.bin) firmware(qca/crnv32u.bin) firmware(qca/hpbtfw21.tlv) firmware(qca/hpnv21.301) firmware(qca/hpnv21.302) firmware(qca/hpnv21.bin) firmware(qca/hpnv21g.301) firmware(qca/hpnv21g.302) firmware(qca/hpnv21g.bin) firmware(qca/htbtfw20.tlv) firmware(qca/htnv20.bin) firmware(qca/msbtfw11.mbn) firmware(qca/msbtfw11.tlv) firmware(qca/msnv11.b09) firmware(qca/msnv11.b0a) firmware(qca/msnv11.bin) firmware(qca/nvm_00130300.bin) firmware(qca/nvm_00130302.bin) firmware(qca/nvm_00230302.bin) firmware(qca/nvm_00440302.bin) firmware(qca/nvm_00440302_eu.bin) firmware(qca/nvm_00440302_i2s_eu.bin) firmware(qca/nvm_usb_00000200.bin) firmware(qca/nvm_usb_00000201.bin) firmware(qca/nvm_usb_00000300.bin) firmware(qca/nvm_usb_00000302.bin) firmware(qca/nvm_usb_00000302_eu.bin) firmware(qca/nvm_usb_00130200.bin) firmware(qca/nvm_usb_00130200_0104.bin) firmware(qca/nvm_usb_00130200_0105.bin) firmware(qca/nvm_usb_00130200_0106.bin) firmware(qca/nvm_usb_00130200_0107.bin) firmware(qca/nvm_usb_00130200_0109.bin) firmware(qca/nvm_usb_00130200_0110.bin) firmware(qca/nvm_usb_00130201.bin) firmware(qca/nvm_usb_00130201_010a.bin) firmware(qca/nvm_usb_00130201_010b.bin) firmware(qca/nvm_usb_00130201_0303.bin) firmware(qca/nvm_usb_00130201_gf.bin) firmware(qca/nvm_usb_00130201_gf_010a.bin) firmware(qca/nvm_usb_00130201_gf_010b.bin) firmware(qca/nvm_usb_00130201_gf_0303.bin) firmware(qca/nvm_usb_00190200.bin) firmware(qca/rampatch_00130300.bin) firmware(qca/rampatch_00130302.bin) firmware(qca/rampatch_00230302.bin) firmware(qca/rampatch_00440302.bin) firmware(qca/rampatch_usb_00000200.bin) firmware(qca/rampatch_usb_00000201.bin) firmware(qca/rampatch_usb_00000300.bin) firmware(qca/rampatch_usb_00000302.bin) firmware(qca/rampatch_usb_00130200.bin) firmware(qca/rampatch_usb_00130201.bin) firmware(qca/rampatch_usb_00190200.bin) firmware(rtl_bt/rtl8192ee_fw.bin) firmware(rtl_bt/rtl8192eu_fw.bin) firmware(rtl_bt/rtl8723a_fw.bin) firmware(rtl_bt/rtl8723b_fw.bin) firmware(rtl_bt/rtl8723bs_config-OBDA0623.bin) firmware(rtl_bt/rtl8723bs_config-OBDA8723.bin) firmware(rtl_bt/rtl8723bs_fw.bin) firmware(rtl_bt/rtl8723d_config.bin) firmware(rtl_bt/rtl8723d_fw.bin) firmware(rtl_bt/rtl8761a_fw.bin) firmware(rtl_bt/rtl8761b_config.bin) firmware(rtl_bt/rtl8761b_fw.bin) firmware(rtl_bt/rtl8761bu_config.bin) firmware(rtl_bt/rtl8761bu_fw.bin) firmware(rtl_bt/rtl8812ae_fw.bin) firmware(rtl_bt/rtl8821a_config.bin) firmware(rtl_bt/rtl8821a_fw.bin) firmware(rtl_bt/rtl8821c_config.bin) firmware(rtl_bt/rtl8821c_fw.bin) firmware(rtl_bt/rtl8821cs_config.bin) firmware(rtl_bt/rtl8821cs_fw.bin) firmware(rtl_bt/rtl8822b_config.bin) firmware(rtl_bt/rtl8822b_fw.bin) firmware(rtl_bt/rtl8822cs_config.bin) firmware(rtl_bt/rtl8822cs_fw.bin) firmware(rtl_bt/rtl8822cu_config.bin) firmware(rtl_bt/rtl8822cu_fw.bin) firmware(rtl_bt/rtl8851bu_config.bin) firmware(rtl_bt/rtl8851bu_fw.bin) firmware(rtl_bt/rtl8852au_config.bin) firmware(rtl_bt/rtl8852au_fw.bin) firmware(rtl_bt/rtl8852bu_config.bin) firmware(rtl_bt/rtl8852bu_fw.bin) firmware(rtl_bt/rtl8852cu_config.bin) firmware(rtl_bt/rtl8852cu_fw.bin) kernel-firmware-bluetooth"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
