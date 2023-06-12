SUMMARY = "Tumbleweed Update Scrutinizer"
DESCRIPTION = "Fetches snapshot scores from Boombatower and can prompt for update based on stability ratings. Searching the snapshot database is also allowed with regex support."
LICENSE = "GPL-3.0-or-later"

PV = "git20200908"

RPM_NAME = "twups-git20200908-1.8.aarch64.rpm"
RPM_HASH = "0279579c0f22d7ca72ea5a937f4245fc9f0d004ca43ec78ba61d3275b5306515f6e39a4026561e69796748e74322b4f68668f8f4f22f4ea84869bd36fe8a46e1"

RPROVIDES:${PN} += "twups \
twups(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash \
curl \
tumbleweed-cli"

inherit rpm
