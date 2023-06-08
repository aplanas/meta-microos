SUMMARY = "Dracut Module to mount a tmpfs overlay on a RO root"
DESCRIPTION = "A dracut module which mounts an overlayfs each on /etc and /var, with the upper \
layer in a tmpfs mount. This is the minimal setup to get a booting system, to \
have a writable /root or /home, additional fstab entries can be added."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20220808.cd59f4f"

RPM_NAME = "read-only-root-fs-volatile-1.0+git20220808.cd59f4f-1.3.noarch.rpm"
RPM_HASH = "c53febe1b640dcfb5a210b1ff0baf3143ba0662d15e7e58c18f422cf08f662f6575530d92c7ecf6fd0112ee176ef3f82da4501ded81fd4d0872eab5fb78b3cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "read-only-root-fs-volatile"
RDEPENDS:${PN} += "/bin/bash dracut"

inherit rpm
