SUMMARY = "Schemas and upgrade stylesheets for Pacemaker"
DESCRIPTION = "Schemas and upgrade stylesheets for Pacemaker \
 \
Pacemaker is an advanced, scalable High-Availability cluster resource \
manager"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-schemas-2.1.5+20230320.22590c566-1.1.noarch.rpm"
RPM_HASH = "54903ab4a6b50b808db58f3cb6b663e5e8c4bc4bfb680930b318e5dc699645f6a0a26f9c8964c87db326ac087835d549b917e7a24c7b6a761bf2dffecbf8efb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pacemaker-schemas \
pkgconfig(pacemaker-schemas)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
