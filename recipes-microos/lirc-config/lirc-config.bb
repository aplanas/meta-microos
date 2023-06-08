SUMMARY = "LIRC Configuration Tools and Data"
DESCRIPTION = "The LIRC config package contains tools and data  to ease the \
LIRC configuration process."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-config-0.10.1-9.3.noarch.rpm"
RPM_HASH = "3712e50f2d56e13b5faede2601378f4e85eed2c77770f32fb15ad7f6ee5acce26719ef54f4387a0eeb48fad40e409bbd52830098171c16c939ac11b018e53251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lirc-config lirc-remotes"
RDEPENDS:${PN} += "lirc-core python3-PyYAML python3-gobject"

inherit rpm
