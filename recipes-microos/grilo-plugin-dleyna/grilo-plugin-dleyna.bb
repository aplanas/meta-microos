SUMMARY = "DLNA (dLeyna) plugin for the Grilo media framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides a plugin for accessing content from a DLNA \
(dLeyna) provider."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugin-dleyna-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "394c914b6cc216e7a09d5b6e65e52b5808d05203498bcd3c9add4f45c591a6a4a335630cd4d29119d6112292b28b8fb00b249432497e89c1b2c8f16b9683cf15"

RPROVIDES:${PN} += "grilo-plugin-dleyna \
grilo-plugin-dleyna(aarch-64) \
grilo-plugin-upnp \
libgrldleyna.so()(64bit)"
RDEPENDS:${PN} += "dbus(com.intel.dleyna-server) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgrilo-0.3.so.0()(64bit)"

inherit rpm
