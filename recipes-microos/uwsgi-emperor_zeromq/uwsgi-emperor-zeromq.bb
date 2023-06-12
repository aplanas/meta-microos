SUMMARY = "ZeroMQ Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) via ZeroMQ."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-emperor_zeromq-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "c97fed1f59b5584b4098e3bb61e580bfd1afca90c81447b6eff3c11063d6acc433a369971e1e1fd9c7eab6e103c42f2ae4c39f1048da37966a928fe3e5ef1c1e"

RPROVIDES:${PN} += "uwsgi-emperor_zeromq \
uwsgi-emperor_zeromq(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libzmq.so.5()(64bit) \
uwsgi"

inherit rpm
