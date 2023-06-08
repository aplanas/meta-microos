SUMMARY = "Support Troubleshooting Tools"
DESCRIPTION = "A package containing troubleshooting tools. This package contains \
the following: supportconfig, chkbin, getappcore, analyzevmcore"
LICENSE = "GPL-2.0-only"

PV = "3.1.21"

RPM_NAME = "supportutils-3.1.21-2.2.noarch.rpm"
RPM_HASH = "0cb6380356923e1db2f4cedf8ba4aa7e42bcd17b5ebf8d1a4d4c8be11337b39c36f7cb11494be1ae5de98f4ae2a77c3f719e7994db60fe0c445284a1b6883f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supportconfig-plugin-icommand supportconfig-plugin-resource supportconfig-plugin-tag supportutils"
RDEPENDS:${PN} += "/bin/bash /usr/bin/awk /usr/bin/sed /usr/bin/which iproute2 kmod-compat ncurses-utils sysfsutils tar util-linux-systemd"

inherit rpm
