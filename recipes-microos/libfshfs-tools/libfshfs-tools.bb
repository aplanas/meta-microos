SUMMARY = "Tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Tools to access the Mac OS Hierarchical File System (HFS). See \
libfshfs for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-tools-20220831-3.9.aarch64.rpm"
RPM_HASH = "9f0ca27a890bfb098b2bd55b4c3045eede54c4c7c3304d7d89ef73f82942fb74cfa74689e07af81962cd5f9ffea64e18282276f09c87abe749dd90fb94fd857a"

RPROVIDES:${PN} += "libfshfs-tools libfshfs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libfshfs.so.1()(64bit) libfshfs.so.1(V_20220831)(64bit) libfshfs1 libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libhmac.so.1()(64bit) libhmac.so.1(V_20230407)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
