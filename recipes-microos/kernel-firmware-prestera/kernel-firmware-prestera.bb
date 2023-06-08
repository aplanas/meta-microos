SUMMARY = "Kernel firmware files for Marvell Prestera ASIC driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell Prestera ASIC driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-prestera-20230427-1.1.noarch.rpm"
RPM_HASH = "bde136bb6076695107d3abc056e5e10ad8c431b4c645899e48b4843982347323ed1b15b4233a42527aebac3c27a3721fc256c45bfda58070843f484c377d841b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(mrvl/prestera/mvsw_prestera_fw-v2.0.img) firmware(mrvl/prestera/mvsw_prestera_fw-v3.0.img) firmware(mrvl/prestera/mvsw_prestera_fw-v4.0.img) firmware(mrvl/prestera/mvsw_prestera_fw-v4.1.img) firmware(mrvl/prestera/mvsw_prestera_fw_arm64-v4.1.img) kernel-firmware-prestera"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
