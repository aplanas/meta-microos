SUMMARY = "RMT default configuration"
DESCRIPTION = "Default nginx configuration for RMT."
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "rmt-server-config-2.12-1.1.aarch64.rpm"
RPM_HASH = "55359b6aef42fcadcb412b1b4aec703a00680e6fa2ef252f74c4323f3d61b88e430e5eecdad744a33d2b65fe9c66840b47859a8713dea418416e509fa5f54e33"

RPROVIDES:${PN} += "config(rmt-server-config) rmt-server-config rmt-server-config(aarch-64) rmt-server-configuration"
RDEPENDS:${PN} += "/bin/sh rmt-server"

inherit rpm
