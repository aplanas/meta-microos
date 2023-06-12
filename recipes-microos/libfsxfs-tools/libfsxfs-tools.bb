SUMMARY = "Utilities to inspect SGI X File Systems (XFS)"
DESCRIPTION = "This subpackage provides the utilities from libfsxfs, which allows for \
reading SGI X File Systems (XFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs-tools-20220829-3.8.aarch64.rpm"
RPM_HASH = "80fbfcf177793ac7c73784a9e0f478400ba3a559c1b010546c792f6914ef3fc13f3ca7c4c95e6bfdc9af3f5358c70f532470d974840e1f80faa5dfb4728f3dac"

RPROVIDES:${PN} += "libfsxfs-tools \
libfsxfs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfsxfs.so.1()(64bit) \
libfsxfs.so.1(V_20220829)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
