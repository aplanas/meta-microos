SUMMARY = "OBS Package Installer (CLI)"
DESCRIPTION = "OBS Package Installer (CLI)"
LICENSE = "GPL-3.0-only"

PV = "2.17.0"

RPM_NAME = "opi-2.17.0-1.1.noarch.rpm"
RPM_HASH = "9ff33877a93825c36170540c1bbb52d42f89892acea9e27fb43860c80834bae06eb64daf061040284c7158970209e6f5a8f273d99bf868bc6819e9692a8b52ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(opi) \
metainfo() \
metainfo(org.openSUSE.opi.appdata.xml) \
opi \
python3.10dist(opi) \
python3dist(opi)"
RDEPENDS:${PN} += "/usr/bin/python3 \
curl \
python(abi) \
python3-curses \
python3-lxml \
python3-requests \
python3-termcolor \
sudo \
zypper"

inherit rpm
