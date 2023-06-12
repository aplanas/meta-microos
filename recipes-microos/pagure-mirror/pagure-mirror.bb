SUMMARY = "The mirroring service for pagure"
DESCRIPTION = "pagure-mirror is the service mirroring projects that asked for it outside \
of this pagure instance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-mirror-5.13.3-1.4.noarch.rpm"
RPM_HASH = "f2d161ecfbe96411c9e821d20baa3489891cdf60cc0049a1cdece52c7f93288315a48dd5b9f47d9e8982d548bb2995a850b5500eadbc0f23531d7f3537887b28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-mirror"
RDEPENDS:${PN} += "/bin/sh \
pagure \
systemd"

inherit rpm
