SUMMARY = "Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-onlyDVD-5.0-69.1.aarch64.rpm"
RPM_HASH = "8b281427ed897e7e7ac35c2cec43a5553313dd4a6ac7df6d99b134cc38f4ffca884256e012cdaf4bf02978a9887bba96317f478d038f54c8539f400a5f6c2155"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-microos-onlyDVD patterns-microos-onlyDVD(aarch-64)"
RDEPENDS:${PN} += "ModemManager NetworkManager-wwan apparmor-utils bcache-tools crda cryptsetup firewalld hyper-v iscsiuio lvm2 multipath-tools nvme-cli open-iscsi open-vm-tools pam_pwquality pattern() policycoreutils-python-utils qemu-guest-agent spice-vdagent tftpboot-installation-openSUSE-MicroOS-aarch64 wpa_supplicant xfsprogs"

inherit rpm
