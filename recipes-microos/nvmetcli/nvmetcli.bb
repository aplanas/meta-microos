SUMMARY = "Command line interface for the kernel NVMe nvmet"
DESCRIPTION = "This package contains the command line interface to the NVMe over \
Fabrics target in the Linux kernel. It allows configuring the NVMe \
target interactively as well as saving / restoring the configuration \
to / from a json file."
LICENSE = "Apache-2.0"

PV = "0.7"

RPM_NAME = "nvmetcli-0.7-2.2.noarch.rpm"
RPM_HASH = "53a44bcb28f03e0aa9916a7c0e20f59450de45dccab8fd56e1d213ac923f9988821034309cdff742361d70aaa5b7d2952713275fc72389bc7eba55c90ef3ff61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvmetcli \
python3.10dist(nvmetcli) \
python3dist(nvmetcli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-configshell-fb \
python3-kmod \
systemd"

inherit rpm
