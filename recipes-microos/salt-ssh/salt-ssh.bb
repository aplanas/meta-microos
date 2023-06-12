SUMMARY = "Management component for Saltstack with ssh protocol"
DESCRIPTION = "Salt ssh is a master running without zmq. \
it enables the management of minions over a ssh connection."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-ssh-3006.0-1.1.aarch64.rpm"
RPM_HASH = "51f57f69e1a674cf64466ffeee54a5b5838bfe75317f828211675ca467ce4e33626970011b5c459bf62df3616b36c42731285d6106ffa0a24c8be29a45267c60"

RPROVIDES:${PN} += "salt-ssh \
salt-ssh(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
salt \
salt-master \
systemd"

inherit rpm
