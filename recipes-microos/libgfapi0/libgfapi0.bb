SUMMARY = "GlusterFS API library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfapi0-11.0-1.3.aarch64.rpm"
RPM_HASH = "3e76690efac721bc1d913f9d19b3bddbdcb1ce142326b94119febeaa859bc41d690635d0c070d59fe3b1496224279df70868f891ce2335fb4471d36d65932008"

RPROVIDES:${PN} += "libgfapi.so.0()(64bit) libgfapi.so.0(GFAPI_11.0)(64bit) libgfapi.so.0(GFAPI_3.10.0)(64bit) libgfapi.so.0(GFAPI_3.10.7)(64bit) libgfapi.so.0(GFAPI_3.11.0)(64bit) libgfapi.so.0(GFAPI_3.13.0)(64bit) libgfapi.so.0(GFAPI_3.4.0)(64bit) libgfapi.so.0(GFAPI_3.4.2)(64bit) libgfapi.so.0(GFAPI_3.5.0)(64bit) libgfapi.so.0(GFAPI_3.5.1)(64bit) libgfapi.so.0(GFAPI_3.6.0)(64bit) libgfapi.so.0(GFAPI_3.7.0)(64bit) libgfapi.so.0(GFAPI_3.7.15)(64bit) libgfapi.so.0(GFAPI_3.7.16)(64bit) libgfapi.so.0(GFAPI_3.7.17)(64bit) libgfapi.so.0(GFAPI_3.7.4)(64bit) libgfapi.so.0(GFAPI_4.0.0)(64bit) libgfapi.so.0(GFAPI_4.1.6)(64bit) libgfapi.so.0(GFAPI_6.0)(64bit) libgfapi.so.0(GFAPI_6.6)(64bit) libgfapi.so.0(GFAPI_7.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_3.12.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_3.4.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_3.7.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_6.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_6.1)(64bit) libgfapi0 libgfapi0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgfrpc.so.0()(64bit) libgfxdr.so.0()(64bit) libglusterfs.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.3)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
