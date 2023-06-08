SUMMARY = "Kernel firmware files for Cavium LiquidIO driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Cavium LiquidIO driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-liquidio-20230427-1.1.noarch.rpm"
RPM_HASH = "ec765d06a0e511bc1ba5b36a7edfa01ed4e977c0fc45f8c8da014ce3f47151116cc0b29483c2834532e3689e73e7f89974a8a07129d6ee56940af177e2371ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(liquidio/lio_210nv_nic.bin) firmware(liquidio/lio_210sv_nic.bin) firmware(liquidio/lio_23xx_nic.bin) firmware(liquidio/lio_410nv_nic.bin) kernel-firmware-liquidio"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
