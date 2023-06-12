SUMMARY = "Supportconfig Analysis Appliance Agent"
DESCRIPTION = "Analyzes supportconfig archives using the Supportconfig Analysis patterns. The results are \
posted in a MySQL database and can be posted or emailed as an html report. \
 \
See /usr/share/doc/packages/sca-appliance-common/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "sca-appliance-agent-1.3.1-1.9.noarch.rpm"
RPM_HASH = "f7259fcf2ca3d59b64b2b4057a59e70ed8765fbfc600e036465b2d8fe339669827efdfdc3badd33d169fe5fca8095d163526640a4b84a1601fe77b5e9de8bc0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(sca-appliance-agent) \
sca-appliance-agent"
RDEPENDS:${PN} += "/bin/bash \
sca-appliance-common \
sca-patterns-base"

inherit rpm
