SUMMARY = "Simple text based JeOS first boot wizard"
DESCRIPTION = "Simple text based JeOS first boot wizard that can be used instead \
of the line based one that is built into systemd."
LICENSE = "MIT"

PV = "1.2.0.5"

RPM_NAME = "jeos-firstboot-1.2.0.5-1.1.noarch.rpm"
RPM_HASH = "a86e6f8c2d710585820bfcb05653b5bc76ecd85fec906c7fa9d9af5ce740df015754306b27fe8d92e5bf695ff48c15fdd16ff61836dc022471582db4041d2506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeos-firstboot"
RDEPENDS:${PN} += "/bin/bash /bin/sh dialog iproute2 live-langset-data systemd timezone"

inherit rpm
