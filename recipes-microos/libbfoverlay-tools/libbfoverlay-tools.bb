SUMMARY = "Utilities to assist with bfio file overlays"
DESCRIPTION = "This subpackage provides the utilities from libbfoverlay."
LICENSE = "LGPL-3.0-or-later"

PV = "20210416"

RPM_NAME = "libbfoverlay-tools-20210416-3.3.aarch64.rpm"
RPM_HASH = "c192c76e795fd95635733cec692ac92eeead2224813173e81ae0ef0cc71dde38e3cc98252de45d6c88e7734a5db33be1df6dc39660dbff1a90409e828008f471"

RPROVIDES:${PN} += "libbfoverlay-tools libbfoverlay-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfoverlay.so.1()(64bit) libbfoverlay.so.1(V_20210416)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit)"

inherit rpm
