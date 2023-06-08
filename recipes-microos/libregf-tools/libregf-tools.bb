SUMMARY = "Utilities to inspect Windows REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-tools-20230319-1.2.aarch64.rpm"
RPM_HASH = "320e537f6b52755e08bd285685264a729e155bb3c0f452e8683044055316bd8acef2b93e332e905f7867f1e98ce0d6c9d8d2eb7df56898628477c7be16d50b21"

RPROVIDES:${PN} += "libregf-tools libregf-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libregf.so.1()(64bit) libregf.so.1(V_20230319)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
