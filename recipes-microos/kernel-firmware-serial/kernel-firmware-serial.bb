SUMMARY = "Kernel firmware files for various serial drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various serial drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-serial-20230427-1.1.noarch.rpm"
RPM_HASH = "75d1d1d27a312f0da09cc4705c9d99e453215684717cfe730e03fb36d6c5742bebafbef3d69af9187ffc12929f619595faa34f231865656c1e19c4f915549ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(edgeport/boot.fw) firmware(edgeport/boot2.fw) firmware(edgeport/down.fw) firmware(edgeport/down2.fw) firmware(edgeport/down3.bin) firmware(keyspan/mpr.fw) firmware(keyspan/usa18x.fw) firmware(keyspan/usa19.fw) firmware(keyspan/usa19qi.fw) firmware(keyspan/usa19qw.fw) firmware(keyspan/usa19w.fw) firmware(keyspan/usa28.fw) firmware(keyspan/usa28x.fw) firmware(keyspan/usa28xa.fw) firmware(keyspan/usa28xb.fw) firmware(keyspan/usa49w.fw) firmware(keyspan/usa49wlc.fw) firmware(keyspan_pda/keyspan_pda.fw) firmware(keyspan_pda/xircom_pgs.fw) firmware(moxa/moxa-1110.fw) firmware(moxa/moxa-1130.fw) firmware(moxa/moxa-1131.fw) firmware(moxa/moxa-1150.fw) firmware(moxa/moxa-1151.fw) firmware(moxa/moxa-1250.fw) firmware(moxa/moxa-1251.fw) firmware(moxa/moxa-1410.fw) firmware(moxa/moxa-1450.fw) firmware(moxa/moxa-1451.fw) firmware(moxa/moxa-1613.fw) firmware(moxa/moxa-1618.fw) firmware(moxa/moxa-1653.fw) firmware(moxa/moxa-1658.fw) firmware(mts_cdma.fw) firmware(mts_edge.fw) firmware(mts_gsm.fw) firmware(mts_mt9234mu.fw) firmware(mts_mt9234zba.fw) firmware(rp2.fw) firmware(ti_3410.fw) firmware(ti_5052.fw) firmware(whiteheat.fw) firmware(whiteheat_loader.fw) kernel-firmware-serial"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
