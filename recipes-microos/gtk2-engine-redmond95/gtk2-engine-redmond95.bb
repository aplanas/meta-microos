SUMMARY = "Redmond GTK+ 2 Theme Engine"
DESCRIPTION = "The Redmond engine and theme are designed to mimic the appearance of \
another well known OS."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-redmond95-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "49b09bad9d1ab4f7ecef923d34d44cdbf4d174d60c153a6d42840ff75ad26e54ca7da7250b19cb294a20cdb404af8dceba49759332894c5b63164b2e43e8e791"

RPROVIDES:${PN} += "gtk2-engine-redmond95 gtk2-engine-redmond95(aarch-64) libredmond95.so()(64bit)"
RDEPENDS:${PN} += "gtk2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
