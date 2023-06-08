SUMMARY = "Config to permit root logins to sshd"
DESCRIPTION = "The openssh-server package by default disallows password based \
root logins. This package provides a config that does. It's useful \
to temporarily have a password based login to be able to use \
ssh-copy-id(1)."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-server-config-rootlogin-8.9p1-9.1.aarch64.rpm"
RPM_HASH = "52c837531ed865c47f618b4247c305571d247dd442837558539bc543c341e6e96537c6a15b531c043fb048b8aa95136cc9fd6e494588862ad00d1d47d6c86d53"

RPROVIDES:${PN} += "openssh-server-config-rootlogin openssh-server-config-rootlogin(aarch-64)"
RDEPENDS:${PN} += "openssh-server"

inherit rpm
