SUMMARY = "Utilities to inspect Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows 9x/Me REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-tools-20210625-5.7.aarch64.rpm"
RPM_HASH = "3ef44bd48d23b7abc3575b3027e3af11bc0eb73a1a7d5f271cfe2ce965efb4254e788bbb35d2c822d8c5fe4c5c28ea3ec10ac45d3b964c76cb1952987a81b81b"

RPROVIDES:${PN} += "libcreg-tools libcreg-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcreg.so.1()(64bit) libcreg.so.1(V_20210625)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
