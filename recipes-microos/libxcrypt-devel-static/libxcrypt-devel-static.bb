SUMMARY = "Static library for -static linking with libxcrypt"
DESCRIPTION = "This package contains the libxcrypt static libraries for -static \
linking.  You don't need this, unless you link statically, which \
is highly discouraged."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.33"

RPM_NAME = "libxcrypt-devel-static-4.4.33-3.1.aarch64.rpm"
RPM_HASH = "937b293207fbedb2063296ae741dff6f4d3d922e3ece62ebe9b1caa86021dce0608cce64ca90d6867f1d0e1e8fc5db36e8836815987e16bf460e09d6cee49eba"

RPROVIDES:${PN} += "glibc-devel-static:/usr/lib64/libcrypt.a libxcrypt-devel-static libxcrypt-devel-static(aarch-64)"
RDEPENDS:${PN} += "glibc-devel-static libxcrypt-devel"

inherit rpm
