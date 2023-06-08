SUMMARY = "The management component of Saltstack with zmq protocol supported"
DESCRIPTION = "The Salt master is the central server to which all minions connect. \
Enabled commands to remote systems to be called in parallel rather \
than serially."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-master-3006.0-1.1.aarch64.rpm"
RPM_HASH = "40e9510a8764a89e32d2cf766891d5fd288c609d34203410b1a0551b0b2302ff93e8b361a801653964d7fdd74f2559ee8040010f4f79c762665cf459b4c6a115"

RPROVIDES:${PN} += "config(salt-master) salt-master salt-master(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/python3 /usr/bin/touch fillup salt systemd"

inherit rpm
