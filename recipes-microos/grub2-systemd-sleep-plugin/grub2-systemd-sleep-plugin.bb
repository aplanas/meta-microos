SUMMARY = "Grub2's systemd-sleep plugin"
DESCRIPTION = "Grub2's systemd-sleep plugin for directly booting hibernated kernel image in \
swap partition while in resuming"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-systemd-sleep-plugin-2.06-51.1.noarch.rpm"
RPM_HASH = "e1586637042c3b17c776a673208dff1378b8f7afec6cce00d13913176c389437a23464c84145d4471ae2a0211dea28c471b3268ecd175f8aebe2edea599e0ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-systemd-sleep-plugin"
RDEPENDS:${PN} += "/bin/bash grub2 util-linux"

inherit rpm
