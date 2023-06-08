SUMMARY = "An X terminal written in Vala"
DESCRIPTION = "A terminal with the capabilities of Guake and Terminator."
LICENSE = "GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "terminus-2.3.1-1.1.aarch64.rpm"
RPM_HASH = "5407e6e069a24009b86eabb9a1cf65755723e321e543a1e6b24d5db1d339b61fdba0ddde705df7ffc82a5bb084df5ac0e50104d3e5649ee617e1f39bc666e55a"

RPROVIDES:${PN} += "application() application(terminus.desktop) config(terminus) terminus terminus(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libkeybinder-3.0.so.0()(64bit) libpango-1.0.so.0()(64bit) libvte-2.91.so.0()(64bit)"

inherit rpm
