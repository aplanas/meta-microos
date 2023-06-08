SUMMARY = "Development files for libevt, a Windows event file parser"
DESCRIPTION = "libevt is a library to access the Windows Event Log (EVT) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-devel-20221022-3.9.aarch64.rpm"
RPM_HASH = "5a740ac22556b0eeab081dcfdefc5e2533e6be0f3cabf679171b08effd57fb3711eea93a268c981c725aa75b340703b287273d422b2a7a0d827cb2c7315797f9"

RPROVIDES:${PN} += "libevt-devel libevt-devel(aarch-64) pkgconfig(libevt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libevt1"

inherit rpm
