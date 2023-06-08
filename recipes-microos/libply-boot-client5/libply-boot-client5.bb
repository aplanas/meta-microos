SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-boot-client library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-boot-client5-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "34a00e75fd2f9c6eef3b9379caaaf319cb2a4bb28ed824eaa5bfa13c5081c681698a1494cee84da64a14140133354ae0abd1949baa16d376d2158b3e4cf676d2"

RPROVIDES:${PN} += "libply-boot-client.so.5()(64bit) libply-boot-client5 libply-boot-client5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libply.so.5()(64bit)"

inherit rpm
