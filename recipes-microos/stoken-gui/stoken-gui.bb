SUMMARY = "Graphical interface program for stoken"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package contains the graphical interface program for stoken."
LICENSE = "LGPL-2.0-or-later & BSD-3-Clause"

PV = "0.92"

RPM_NAME = "stoken-gui-0.92-1.21.aarch64.rpm"
RPM_HASH = "105f194237ae91400b7b7d3c2a9fc8fd205e57fbbad2d3d62ca795bd61830630bc48bd728a0f123c3b82938b49b67fac33e171a09857d7b16744de4d6b0b418f"

RPROVIDES:${PN} += "application() \
application(stoken-gui-small.desktop) \
application(stoken-gui.desktop) \
stoken-gui \
stoken-gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstoken.so.1()(64bit) \
libstoken.so.1(STOKEN_1.3)(64bit) \
libstoken.so.1(STOKEN_PRIVATE)(64bit) \
libstoken1"

inherit rpm
