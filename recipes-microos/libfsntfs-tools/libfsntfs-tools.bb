SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs-tools is a project to access the NTFS filesystem \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "libfsntfs-tools-20230427-1.1.aarch64.rpm"
RPM_HASH = "d9acd21d51e618805f89bf3a80bb3744d34f4d67e45af16da7d55fd374e7e4ffb7f9168395a85d401900ac2ad87e5821750163e699b2f20a36a182e6b6083fdd"

RPROVIDES:${PN} += "libfsntfs-tools libfsntfs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfsntfs.so.1()(64bit) libfsntfs.so.1(V_20230427)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfusn.so.1()(64bit) libfusn.so.1(V_20220119)(64bit) libfwnt.so.1()(64bit) libfwnt.so.1(V_20220922)(64bit) libhmac.so.1()(64bit) libhmac.so.1(V_20230407)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
