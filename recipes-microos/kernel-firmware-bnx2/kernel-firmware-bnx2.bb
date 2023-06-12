SUMMARY = "Kernel firmware files for Broadcom network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Broadcom network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-bnx2-20230517-1.1.noarch.rpm"
RPM_HASH = "c446d2bdd204e6397b4013ae8036a78c47a5924194ee1b8eeebcc4f0718d757d55543718bfe64c52dfac3b31737c95b311c2272ba044fd752d5edac82d5117ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(bnx2/bnx2-mips-06-6.2.3.fw) firmware(bnx2/bnx2-mips-09-6.2.1b.fw) firmware(bnx2/bnx2-rv2p-06-6.0.15.fw) firmware(bnx2/bnx2-rv2p-09-6.0.17.fw) firmware(bnx2/bnx2-rv2p-09ax-6.0.17.fw) firmware(bnx2x/bnx2x-e1-7.13.1.0.fw) firmware(bnx2x/bnx2x-e1-7.13.11.0.fw) firmware(bnx2x/bnx2x-e1-7.13.15.0.fw) firmware(bnx2x/bnx2x-e1-7.13.21.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.1.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.11.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.15.0.fw) firmware(bnx2x/bnx2x-e1h-7.13.21.0.fw) firmware(bnx2x/bnx2x-e2-7.13.1.0.fw) firmware(bnx2x/bnx2x-e2-7.13.11.0.fw) firmware(bnx2x/bnx2x-e2-7.13.15.0.fw) firmware(bnx2x/bnx2x-e2-7.13.21.0.fw) kernel-firmware-bnx2"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
