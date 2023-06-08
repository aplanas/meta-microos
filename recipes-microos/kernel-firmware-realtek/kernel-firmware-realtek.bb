SUMMARY = "Kernel firmware files for Realtek wireless drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Realtek wireless drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-realtek-20230427-1.1.noarch.rpm"
RPM_HASH = "c9df0c29749680aaab6df5e96f2d2c9c46011b8572a1b153a35b44a8d100b13f0978e1d78b7e32df84449de88b2b8922895963de5f573fa27e9e618789f173ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(RTL8192E/boot.img) firmware(RTL8192E/data.img) firmware(RTL8192E/main.img) firmware(rt2860.bin) firmware(rt2870.bin) firmware(rt3070.bin) firmware(rt3071.bin) firmware(rt3090.bin) firmware(rt3290.bin) firmware(rtl_nic/rtl8105e-1.fw) firmware(rtl_nic/rtl8106e-1.fw) firmware(rtl_nic/rtl8106e-2.fw) firmware(rtl_nic/rtl8107e-1.fw) firmware(rtl_nic/rtl8107e-2.fw) firmware(rtl_nic/rtl8125a-3.fw) firmware(rtl_nic/rtl8125b-1.fw) firmware(rtl_nic/rtl8125b-2.fw) firmware(rtl_nic/rtl8153a-2.fw) firmware(rtl_nic/rtl8153a-3.fw) firmware(rtl_nic/rtl8153a-4.fw) firmware(rtl_nic/rtl8153b-2.fw) firmware(rtl_nic/rtl8153c-1.fw) firmware(rtl_nic/rtl8156a-2.fw) firmware(rtl_nic/rtl8156b-2.fw) firmware(rtl_nic/rtl8168d-1.fw) firmware(rtl_nic/rtl8168d-2.fw) firmware(rtl_nic/rtl8168e-1.fw) firmware(rtl_nic/rtl8168e-2.fw) firmware(rtl_nic/rtl8168e-3.fw) firmware(rtl_nic/rtl8168f-1.fw) firmware(rtl_nic/rtl8168f-2.fw) firmware(rtl_nic/rtl8168fp-3.fw) firmware(rtl_nic/rtl8168g-1.fw) firmware(rtl_nic/rtl8168g-2.fw) firmware(rtl_nic/rtl8168g-3.fw) firmware(rtl_nic/rtl8168h-1.fw) firmware(rtl_nic/rtl8168h-2.fw) firmware(rtl_nic/rtl8402-1.fw) firmware(rtl_nic/rtl8411-1.fw) firmware(rtl_nic/rtl8411-2.fw) firmware(rtlwifi/rtl8188efw.bin) firmware(rtlwifi/rtl8188eufw.bin) firmware(rtlwifi/rtl8188fufw.bin) firmware(rtlwifi/rtl8192cfw.bin) firmware(rtlwifi/rtl8192cfwU.bin) firmware(rtlwifi/rtl8192cfwU_B.bin) firmware(rtlwifi/rtl8192cufw.bin) firmware(rtlwifi/rtl8192cufw_A.bin) firmware(rtlwifi/rtl8192cufw_B.bin) firmware(rtlwifi/rtl8192cufw_TMSC.bin) firmware(rtlwifi/rtl8192defw.bin) firmware(rtlwifi/rtl8192eefw.bin) firmware(rtlwifi/rtl8192eu_ap_wowlan.bin) firmware(rtlwifi/rtl8192eu_nic.bin) firmware(rtlwifi/rtl8192eu_wowlan.bin) firmware(rtlwifi/rtl8192sefw.bin) firmware(rtlwifi/rtl8710bufw_SMIC.bin) firmware(rtlwifi/rtl8710bufw_UMC.bin) firmware(rtlwifi/rtl8712u.bin) firmware(rtlwifi/rtl8723aufw_A.bin) firmware(rtlwifi/rtl8723aufw_B.bin) firmware(rtlwifi/rtl8723aufw_B_NoBT.bin) firmware(rtlwifi/rtl8723befw.bin) firmware(rtlwifi/rtl8723befw_36.bin) firmware(rtlwifi/rtl8723bs_ap_wowlan.bin) firmware(rtlwifi/rtl8723bs_bt.bin) firmware(rtlwifi/rtl8723bs_nic.bin) firmware(rtlwifi/rtl8723bs_wowlan.bin) firmware(rtlwifi/rtl8723bu_ap_wowlan.bin) firmware(rtlwifi/rtl8723bu_nic.bin) firmware(rtlwifi/rtl8723bu_wowlan.bin) firmware(rtlwifi/rtl8723defw.bin) firmware(rtlwifi/rtl8723fw.bin) firmware(rtlwifi/rtl8723fw_B.bin) firmware(rtlwifi/rtl8812aefw.bin) firmware(rtlwifi/rtl8812aefw_wowlan.bin) firmware(rtlwifi/rtl8821aefw.bin) firmware(rtlwifi/rtl8821aefw_29.bin) firmware(rtlwifi/rtl8821aefw_wowlan.bin) firmware(rtlwifi/rtl8822befw.bin) firmware(rtw88/README) firmware(rtw88/rtw8723d_fw.bin) firmware(rtw88/rtw8821c_fw.bin) firmware(rtw88/rtw8822b_fw.bin) firmware(rtw88/rtw8822c_fw.bin) firmware(rtw88/rtw8822c_wow_fw.bin) firmware(rtw89/rtw8852a_fw.bin) firmware(rtw89/rtw8852b_fw-1.bin) firmware(rtw89/rtw8852b_fw.bin) firmware(rtw89/rtw8852c_fw.bin) kernel-firmware-realtek"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
