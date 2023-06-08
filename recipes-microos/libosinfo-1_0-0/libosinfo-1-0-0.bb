SUMMARY = "Operating system and hypervisor information management library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-1_0-0-1.10.0-3.3.aarch64.rpm"
RPM_HASH = "53e08bfa96091236fd78609de340f65c22d2f12e8de5a8024d8fcdd5242b2fa613efc5e0e127d0afe4ec046bed8e0342f6b5c676f8bfbed4d70da79a42a110ee"

RPROVIDES:${PN} += "libosinfo-1.0.so.0()(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.3)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.5)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.6)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.1.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.1)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.10)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.11)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.12)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.13)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.2)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.3)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.6)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.7)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.8)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.9)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.10.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.3.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.4.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.5.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.6.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.7.0)(64bit) libosinfo-1.0.so.0(LIBOSINFO_1.8.0)(64bit) libosinfo-1_0-0 libosinfo-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig hwdata ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libosinfo libsoup-3.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit)"

inherit rpm
