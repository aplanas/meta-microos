SUMMARY = "Remote magnetic tape protocol server"
DESCRIPTION = "rmt is a program that can be used by e.g. star and ufsdump \
for accessing remote magnetic tape drives and files through an \
interprocess communication connection. \
 \
A tape client would launch something like ssh for the actual \
connection, and through that, have the rmt program executed."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "schily-rmt-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "c68cde6129d59287ffec34a1af399b8d9b92a89fc86a79cd074c129aedff860760305f6c84aec88626eee2b1bb00b6895da53f5eff6c92ba52175d60fa6ae9d6"

RPROVIDES:${PN} += "config(schily-rmt) \
rmt \
schily-rmt \
schily-rmt(aarch-64) \
star-rmt:/usr/bin/srmt"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdeflt.so.1.0()(64bit) \
libdeflt.so.1.0(SCHILY_1.0)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
update-alternatives"

inherit rpm
