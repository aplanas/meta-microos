SUMMARY = "System Upgrade Plugin for DNF"
DESCRIPTION = "System Upgrade Plugin for DNF, Python 3 version. Enables offline system upgrades \
using the 'dnf system-upgrade' command."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-system-upgrade-4.0.17-2.1.noarch.rpm"
RPM_HASH = "92c0c439aad74190fcd07d1a9915fdd098cc674017885b6a720de163b5335bd44f36e82807be8e82fd8bd1e80e158f98b927409c96cf1c1fa9845165a975300b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command(offline-distrosync) \
dnf-command(offline-upgrade) \
dnf-command(system-upgrade) \
dnf-plugin-system-upgrade \
dnf-plugins-extras-system-upgrade \
python3-dnf-plugin-system-upgrade \
python3-dnf-plugins-extras-system-upgrade \
system-upgrade"
RDEPENDS:${PN} += "python(abi) \
python3-dnf-plugins-extras-common \
python3-systemd \
systemd"

inherit rpm
