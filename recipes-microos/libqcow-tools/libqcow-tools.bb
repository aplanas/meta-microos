SUMMARY = "Tools to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Tools to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow-tools-20221124-3.9.aarch64.rpm"
RPM_HASH = "1114c0c75d7da361607326976159218d3705ed4b6693384044979231cbc241a79305f9e824df116602915090ed20a33890e52492fc944a1540e087d9b02afad9"

RPROVIDES:${PN} += "libqcow-tools libqcow-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcpath.so.1()(64bit) libcpath.so.1(V_20220108)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libqcow.so.1()(64bit) libqcow.so.1(V_20221124)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
