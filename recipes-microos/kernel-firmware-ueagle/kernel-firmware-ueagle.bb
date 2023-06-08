SUMMARY = "Kernel firmware files for Eagle IV USB ADSL modem driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Eagle IV USB ADSL modem driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-ueagle-20230427-1.1.noarch.rpm"
RPM_HASH = "ce1ebd706eef0b2dd7dd1ebeb527cfdf38ef79226dd06079b3bc59302c17d0f1a1cd28531e7518a1343a3e387f8a3ab50e5a4facb2d8fb322acf2ac50cdb79da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(ueagle-atm/930-fpga.bin) firmware(ueagle-atm/CMV4p.bin.v2) firmware(ueagle-atm/CMV9i.bin) firmware(ueagle-atm/CMV9p.bin) firmware(ueagle-atm/CMVei.bin) firmware(ueagle-atm/CMVeiWO.bin) firmware(ueagle-atm/CMVep.bin) firmware(ueagle-atm/CMVepES.bin) firmware(ueagle-atm/CMVepES03.bin) firmware(ueagle-atm/CMVepFR.bin) firmware(ueagle-atm/CMVepFR04.bin) firmware(ueagle-atm/CMVepFR10.bin) firmware(ueagle-atm/CMVepIT.bin) firmware(ueagle-atm/CMVepWO.bin) firmware(ueagle-atm/DSP4p.bin) firmware(ueagle-atm/DSP9i.bin) firmware(ueagle-atm/DSP9p.bin) firmware(ueagle-atm/DSPei.bin) firmware(ueagle-atm/DSPep.bin) firmware(ueagle-atm/adi930.fw) firmware(ueagle-atm/eagleI.fw) firmware(ueagle-atm/eagleII.fw) firmware(ueagle-atm/eagleIII.fw) firmware(ueagle-atm/eagleIV.fw) kernel-firmware-ueagle"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
