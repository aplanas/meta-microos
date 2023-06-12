SUMMARY = "RpmConf Plugin for DNF"
DESCRIPTION = "RpmConf Plugin for DNF, Python 3 version. Handles .rpmnew, .rpmsave every \
transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-rpmconf-4.0.17-2.1.noarch.rpm"
RPM_HASH = "75840d96c4a60b01794de2a63b370a8bca6e1d478a4fe9d393bcd903fda02aa857874114ccef7b823fb7cc7acfa9ada9073ccdc9b66674a9583452d1ce457a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-dnf-plugin-rpmconf) \
dnf-plugin-rpmconf \
dnf-plugins-extras-rpmconf \
python3-dnf-plugin-rpmconf \
python3-dnf-plugins-extras-rpmconf \
yum-merge-conf"
RDEPENDS:${PN} += "python(abi) \
python3-dnf-plugins-extras-common \
python3-rpmconf"

inherit rpm
