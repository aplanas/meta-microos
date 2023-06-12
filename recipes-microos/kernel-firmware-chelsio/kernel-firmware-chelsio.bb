SUMMARY = "Kernel firmware files for Chelsio network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Chelsio network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-chelsio-20230517-1.1.noarch.rpm"
RPM_HASH = "2729ee5997630cce5fff096af457e30e68ded1bfa770765a858196202cb6919a5d94b867e9363d54f981336426a545fb97aaa46f785dd22612572228602fd1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cxgb3-firmware firmware(cxgb3/ael2005_opt_edc.bin) firmware(cxgb3/ael2005_twx_edc.bin) firmware(cxgb3/ael2020_twx_edc.bin) firmware(cxgb3/t3b_psram-1.1.0.bin) firmware(cxgb3/t3c_psram-1.1.0.bin) firmware(cxgb3/t3fw-7.0.0.bin) firmware(cxgb3/t3fw-7.1.0.bin) firmware(cxgb3/t3fw-7.10.0.bin) firmware(cxgb3/t3fw-7.12.0.bin) firmware(cxgb3/t3fw-7.4.0.bin) firmware(cxgb4/aq1202_fw.cld) firmware(cxgb4/bcm8483.bin) firmware(cxgb4/configs/t4-config-default.txt) firmware(cxgb4/configs/t5-config-default.txt) firmware(cxgb4/configs/t5-config-hashfilter.txt) firmware(cxgb4/configs/t6-config-default.txt) firmware(cxgb4/configs/t6-config-hashfilter.txt) firmware(cxgb4/t4-config.txt) firmware(cxgb4/t4fw-1.14.4.0.bin) firmware(cxgb4/t4fw-1.15.37.0.bin) firmware(cxgb4/t4fw-1.27.1.0.bin) firmware(cxgb4/t4fw.bin) firmware(cxgb4/t5-config.txt) firmware(cxgb4/t5fw-1.14.4.0.bin) firmware(cxgb4/t5fw-1.15.37.0.bin) firmware(cxgb4/t5fw-1.27.1.0.bin) firmware(cxgb4/t5fw.bin) firmware(cxgb4/t6-config.txt) firmware(cxgb4/t6fw-1.27.1.0.bin) firmware(cxgb4/t6fw.bin) kernel-firmware-chelsio"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
