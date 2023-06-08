SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-2.37-3.1.aarch64.rpm"
RPM_HASH = "6c995a374efe566a10485a0709420f4a6c65dfb7498b658f30cfaa9a9db8d5a85cc4674efcfa4ce4e492ea99a5b68c1ae4e946dbc252203cbde9d4e42e8ac262"

RPROVIDES:${PN} += "epoll glibc-devel glibc-devel(aarch-64)"
RDEPENDS:${PN} += "glibc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxcrypt-devel linux-kernel-headers"

inherit rpm
