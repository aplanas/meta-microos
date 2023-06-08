SUMMARY = "Set of tools for X windows manipulation"
DESCRIPTION = "wmutils's core is a set of tools for manipulating X11 windows. \
Each tool only has one purpose."
LICENSE = "ISC"

PV = "1.5"

RPM_NAME = "wmutils-1.5-1.8.aarch64.rpm"
RPM_HASH = "957a6924e359e20229775b4ac1cfab4ae9b9deb7b75191281f7d3b2992caf07fb9900f25a81c99c67e6b95a4ed40183530730aa17bace0fa8bfa9debf5a89115"

RPROVIDES:${PN} += "wmutils wmutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxcb-cursor.so.0()(64bit) libxcb-util.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
