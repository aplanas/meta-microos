SUMMARY = "Operating system and hypervisor information management library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-1.10.0-3.3.aarch64.rpm"
RPM_HASH = "b213a1c3baca2a9e974e515e5ef0cb242f3557548214206463d519c65e851bb4dc533d547f6ca83b30dad3a8e946ba19474293be659bb3af0c8342e67412b74a"

RPROVIDES:${PN} += "libosinfo libosinfo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libosinfo-1.0.so.0()(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.3)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.1.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.1)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.10)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.12)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.2)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.3)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.9)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.10.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.3.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.5.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.6.0)(64bit) osinfo-db"

inherit rpm
