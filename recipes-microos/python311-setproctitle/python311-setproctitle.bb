SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-setproctitle-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "0798f07e63747b022b515996e24bdf9d920564b8eb73fe6a964932b16f2ffc3d9a1070291b932f19676abadb4d38f35dd1e7a14382e0b45f52de5f2531faffea"

RPROVIDES:${PN} += "python3.11dist(setproctitle) python311-setproctitle python311-setproctitle(aarch-64) python3dist(setproctitle)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
