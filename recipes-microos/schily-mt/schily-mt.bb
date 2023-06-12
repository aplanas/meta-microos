SUMMARY = "Magnetic tape control"
DESCRIPTION = "The mt/smt program sends commands to a local or a remote magnetic \
tape drive."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "schily-mt-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "826ae87a96b17ce5a017763c4fcc07523e87d719eb0810495ea89cfb445bc13bbda8f19356f2c0e60e97246b5a63fc9aa278715d0300d5902a81f0016351eb79"

RPROVIDES:${PN} += "mt \
schily-mt \
schily-mt(aarch-64) \
star-rmt:/usr/bin/smt"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
librmt.so.1.0()(64bit) \
librmt.so.1.0(SCHILY_1.0)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.10)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit) \
update-alternatives"

inherit rpm
