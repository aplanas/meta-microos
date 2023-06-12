SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python39-setproctitle-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "c1046fddf2c246c17bd9c26bbe8db28e3c59a13759f8dfadd899e8f276a4226c4b2c43e7f6ee3860807de5e457580017885acde3b9f5b3e8be55fc33393b850e"

RPROVIDES:${PN} += "python3.9dist(setproctitle) \
python39-setproctitle \
python39-setproctitle(aarch-64) \
python3dist(setproctitle)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
