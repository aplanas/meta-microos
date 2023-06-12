SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-systemd-sleep-plugin-2.06-53.1.noarch.rpm"
RPM_HASH = "f7b81845950b987fd883c6cf778968a7cf649708efe7f2ddbe41b17597c71ad0233ebd57a1d94f5f9fc4c35259a9591cc2b7a559c7420129cd3d334fae6ce585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"
RDEPENDS:${PN} += "/bin/bash \
grub2 \
util-linux"

inherit rpm
