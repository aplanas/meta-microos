SUMMARY = "Kernel firmware files for Atheros wireless drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros wireless drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-atheros-20230517-1.1.noarch.rpm"
RPM_HASH = "8c62f2ad9828772c4234ae6ea5c2b753f86e4508df617c0ddebff0bfdc7a334bc26d3fa46f0335b92c753907c9394265b68a3fb32f39858420a5b53c67c42150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ath3k-firmware \
firmware(ar3k/1020200/PS_ASIC.pst) \
firmware(ar3k/1020200/RamPatch.txt) \
firmware(ar3k/1020200/ar3kbdaddr.pst) \
firmware(ar3k/1020201/PS_ASIC.pst) \
firmware(ar3k/1020201/RamPatch.txt) \
firmware(ar3k/1020201coex/ramps_0x01020201_26_HighPriority.dfu) \
firmware(ar3k/30000/PS_ASIC.pst) \
firmware(ar3k/30000/RamPatch.txt) \
firmware(ar3k/30000/ar3kbdaddr.pst) \
firmware(ar3k/30101/PS_ASIC.pst) \
firmware(ar3k/30101/RamPatch.txt) \
firmware(ar3k/30101/ar3kbdaddr.pst) \
firmware(ar3k/30101coex/PS_ASIC.pst) \
firmware(ar3k/30101coex/PS_ASIC_aclHighPri.pst) \
firmware(ar3k/30101coex/PS_ASIC_aclLowPri.pst) \
firmware(ar3k/30101coex/RamPatch.txt) \
firmware(ar3k/30101coex/ar3kbdaddr.pst) \
firmware(ar3k/AthrBT_0x01020001.dfu) \
firmware(ar3k/AthrBT_0x01020200.dfu) \
firmware(ar3k/AthrBT_0x01020201.dfu) \
firmware(ar3k/AthrBT_0x11020000.dfu) \
firmware(ar3k/AthrBT_0x11020100.dfu) \
firmware(ar3k/AthrBT_0x31010000.dfu) \
firmware(ar3k/AthrBT_0x31010100.dfu) \
firmware(ar3k/AthrBT_0x41020000.dfu) \
firmware(ar3k/ramps_0x01020001_26.dfu) \
firmware(ar3k/ramps_0x01020200_26.dfu) \
firmware(ar3k/ramps_0x01020200_40.dfu) \
firmware(ar3k/ramps_0x01020201_26.dfu) \
firmware(ar3k/ramps_0x01020201_40.dfu) \
firmware(ar3k/ramps_0x11020000_40.dfu) \
firmware(ar3k/ramps_0x11020100_40.dfu) \
firmware(ar3k/ramps_0x31010000_40.dfu) \
firmware(ar3k/ramps_0x31010100_40.dfu) \
firmware(ar3k/ramps_0x41020000_40.dfu) \
firmware(ar5523.bin) \
firmware(ar7010.fw) \
firmware(ar7010_1_1.fw) \
firmware(ar9170-1.fw) \
firmware(ar9170-2.fw) \
firmware(ar9271.fw) \
firmware(ath3k-1.fw) \
firmware(ath6k/AR6002/athwlan.bin.z77) \
firmware(ath6k/AR6002/data.patch.hw2_0.bin) \
firmware(ath6k/AR6002/eeprom.bin) \
firmware(ath6k/AR6002/eeprom.data) \
firmware(ath6k/AR6003.1/hw2.1.1/athwlan.bin) \
firmware(ath6k/AR6003.1/hw2.1.1/bdata.SD31.bin) \
firmware(ath6k/AR6003.1/hw2.1.1/bdata.SD32.bin) \
firmware(ath6k/AR6003.1/hw2.1.1/bdata.WB31.bin) \
firmware(ath6k/AR6003.1/hw2.1.1/data.patch.bin) \
firmware(ath6k/AR6003.1/hw2.1.1/endpointping.bin) \
firmware(ath6k/AR6003.1/hw2.1.1/otp.bin) \
firmware(ath6k/AR6003/hw1.0/athwlan.bin.z77) \
firmware(ath6k/AR6003/hw1.0/bdata.SD31.bin) \
firmware(ath6k/AR6003/hw1.0/bdata.SD32.bin) \
firmware(ath6k/AR6003/hw1.0/bdata.WB31.bin) \
firmware(ath6k/AR6003/hw1.0/data.patch.bin) \
firmware(ath6k/AR6003/hw1.0/otp.bin.z77) \
firmware(ath6k/AR6003/hw2.0/athwlan.bin.z77) \
firmware(ath6k/AR6003/hw2.0/bdata.SD31.bin) \
firmware(ath6k/AR6003/hw2.0/bdata.SD32.bin) \
firmware(ath6k/AR6003/hw2.0/bdata.WB31.bin) \
firmware(ath6k/AR6003/hw2.0/data.patch.bin) \
firmware(ath6k/AR6003/hw2.0/otp.bin.z77) \
firmware(ath6k/AR6003/hw2.1.1/athwlan.bin) \
firmware(ath6k/AR6003/hw2.1.1/bdata.SD31.bin) \
firmware(ath6k/AR6003/hw2.1.1/bdata.SD32.bin) \
firmware(ath6k/AR6003/hw2.1.1/bdata.WB31.bin) \
firmware(ath6k/AR6003/hw2.1.1/data.patch.bin) \
firmware(ath6k/AR6003/hw2.1.1/endpointping.bin) \
firmware(ath6k/AR6003/hw2.1.1/fw-2.bin) \
firmware(ath6k/AR6003/hw2.1.1/fw-3.bin) \
firmware(ath6k/AR6003/hw2.1.1/otp.bin) \
firmware(ath6k/AR6004/hw1.2/bdata.bin) \
firmware(ath6k/AR6004/hw1.2/fw-2.bin) \
firmware(ath6k/AR6004/hw1.3/bdata.bin) \
firmware(ath6k/AR6004/hw1.3/fw-3.bin) \
firmware(ath9k_htc/htc_7010-1.4.0.fw) \
firmware(ath9k_htc/htc_9271-1.4.0.fw) \
firmware(carl9170-1.fw) \
firmware(htc_7010.fw) \
firmware(htc_9271.fw) \
firmware(wil6210.brd) \
firmware(wil6210.fw) \
kernel-firmware-atheros"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
