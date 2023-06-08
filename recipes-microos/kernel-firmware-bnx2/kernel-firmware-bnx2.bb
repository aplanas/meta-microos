SUMMARY = "Kernel firmware files for Broadcom network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Broadcom network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-bnx2-20230427-1.1.noarch.rpm"
RPM_HASH = "5bed269f94dc6b341b0cb9ccb886e802a35640d13de3ea3b374bc994f1f5508dea91cfd450ebcacae6ccc65f676207ad9ae1fe67fb6b8bd968321110eeeeb7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(bnx2/bnx2-mips-06-6.2.3.fw) firmware(bnx2/bnx2-mips-09-6.2.1b.fw) firmware(bnx2/bnx2-rv2p-06-6.0.15.fw) firmware(bnx2/bnx2-rv2p-09-6.0.17.fw) firmware(bnx2/bnx2-rv2p-09ax-6.0.17.fw) firmware(bnx2x/bnx2x-e1-7.13.1.0.fw) firmware(bnx2x/bnx2x-e1-7.13.11.0.fw) firmware(bnx2x/bnx2x-e1-7.13.15.0.fw) firmware(bnx2x/bnx2x-e1-7.13.21.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.1.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.11.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.15.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.21.0.fw) firmware(bnx2x/bnx2x-e2-7.13.1.0.fw) firmware(bnx2x/bnx2x-e2-7.13.11.0.fw) firmware(bnx2x/bnx2x-e2-7.13.15.0.fw) firmware(bnx2x/bnx2x-e2-7.13.21.0.fw) kernel-firmware-bnx2"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
