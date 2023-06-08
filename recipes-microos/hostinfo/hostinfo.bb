SUMMARY = "Gathers basic server information"
DESCRIPTION = "A script that displays current system information to help \
identify a host and its resources."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "hostinfo-1.0.7-1.5.noarch.rpm"
RPM_HASH = "bff2a9e961c81c4849e7e8d517cdb9cdfd5244988c3a595166d7cf1821523b8fa87e9fed33d38c85637526c67b267f8f3cba7adc6a88b8abac56e6ffa4816a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(hostinfo) hostinfo"
RDEPENDS:${PN} += "/bin/bash /bin/sh iproute2 issue-generator sed"

inherit rpm
