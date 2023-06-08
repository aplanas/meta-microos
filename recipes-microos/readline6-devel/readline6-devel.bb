SUMMARY = "Development files for the readline library version 6"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "6.3"

RPM_NAME = "readline6-devel-6.3-3.3.aarch64.rpm"
RPM_HASH = "f7e3b52fdb53e52ebb593be3ff508554f867929b833e74da812765032c1b8f0698edacf3e1a50f3f1f6cc4e819659764d833bc9ce58e490865d4b6e0b54f5226"

RPROVIDES:${PN} += "bash:/usr/lib64/libreadline.a readline6-devel readline6-devel(aarch-64)"
RDEPENDS:${PN} += "libreadline6 ncurses-devel"

inherit rpm
