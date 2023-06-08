SUMMARY = "Vala programming language runtime"
DESCRIPTION = "Runtime library for the Vala programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "libvala-0_56-0-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "a59c7d804e712de4310d9783e3fbbadef6b65f97c2414456efc55a3bb13b23a3c7037b4a2cb1f4c30a5f7b517094333b5722edea9031e81311bd584bd32a1e4d"

RPROVIDES:${PN} += "libvala-0.56.so.0()(64bit) libvala-0_56-0 libvala-0_56-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
