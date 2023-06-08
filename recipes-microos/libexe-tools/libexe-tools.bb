SUMMARY = "Tools to access Microsoft executable (EXE) format files"
DESCRIPTION = "Tools to access Microsoft executable (.exe) format files \
including PE/COFF formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-tools-20210424-4.6.aarch64.rpm"
RPM_HASH = "0e99e1543147bc84c85737005984b3c4e4482f337345772f6109f312986920e1b2f497664ff14a92eafd203c6399c4fff464f946132c6fadbae5a029eea4f800"

RPROVIDES:${PN} += "libexe-tools libexe-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libexe.so.1()(64bit) libexe.so.1(V_20210424)(64bit)"

inherit rpm
