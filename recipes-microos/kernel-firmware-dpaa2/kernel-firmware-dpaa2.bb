SUMMARY = "Kernel firmware files for NXP Management Complex bus driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
NXP Management Complex bus driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-dpaa2-20230427-1.1.noarch.rpm"
RPM_HASH = "f738285fb136ce21316b4083704d4b7f0abc522df0dab3780fd9d2bd60ea8add4e71945d1b20e659f28a89818ea8fb41c7355bcb810c2810449b2b2935c4e20f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(dpaa2/mc/mc_10.10.0_ls1088a.itb) firmware(dpaa2/mc/mc_10.10.0_ls2088a.itb) firmware(dpaa2/mc/mc_10.10.0_lx2160a.itb) firmware(dpaa2/mc/mc_10.14.3_ls1088a.itb) firmware(dpaa2/mc/mc_10.14.3_ls2088a.itb) firmware(dpaa2/mc/mc_10.14.3_lx2160a.itb) firmware(dpaa2/mc/mc_10.16.2_ls1088a.itb) firmware(dpaa2/mc/mc_10.16.2_ls2088a.itb) firmware(dpaa2/mc/mc_10.16.2_lx2160a.itb) firmware(dpaa2/mc/mc_10.18.0_ls1088a.itb) firmware(dpaa2/mc/mc_10.18.0_ls2088a.itb) firmware(dpaa2/mc/mc_10.18.0_lx2160a.itb) firmware(dpaa2/mc/mc_10.28.1_ls1088a.itb) firmware(dpaa2/mc/mc_10.28.1_ls2088a.itb) firmware(dpaa2/mc/mc_10.28.1_lx2160a.itb) kernel-firmware-dpaa2"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
