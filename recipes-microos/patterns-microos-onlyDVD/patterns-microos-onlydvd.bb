SUMMARY = "Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-onlyDVD-5.0-70.1.aarch64.rpm"
RPM_HASH = "bbab517afe1b6561466903d63db7b823dd421362af37ddf40f0d32ee207ec5b8caab9917266ff3e9ac2059a247ee2d9bf64d5763501bfb816eadf7a0d9cc0354"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-microos-onlyDVD patterns-microos-onlyDVD(aarch-64)"
RDEPENDS:${PN} += "ModemManager NetworkManager-wwan apparmor-utils bcache-tools crda cryptsetup firewalld hyper-v iscsiuio lvm2 multipath-tools nvme-cli open-iscsi open-vm-tools pam_pwquality pattern() policycoreutils-python-utils qemu-guest-agent spice-vdagent tftpboot-installation-openSUSE-MicroOS-aarch64 wpa_supplicant xfsprogs"

inherit rpm
