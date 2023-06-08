SUMMARY = "C library static libraries for -static linking"
DESCRIPTION = "The glibc-devel-static package contains the C library static libraries \
for -static linking.  You don't need these, unless you link statically, \
which is highly discouraged."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-static-2.37-3.1.aarch64.rpm"
RPM_HASH = "4ee8502c873ffd9ac137ce8e25181eced7e86085acbf3f424c95b3739356baf30efef782a808614679907c0b92e07cc5b7d458a839268ef16acda8ae36387fae"

RPROVIDES:${PN} += "glibc-devel-static glibc-devel-static(aarch-64) glibc-static"
RDEPENDS:${PN} += "glibc-devel libxcrypt-devel-static"

inherit rpm
