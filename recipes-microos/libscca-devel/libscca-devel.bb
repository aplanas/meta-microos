SUMMARY = "Development files for libscca"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libscca."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca-devel-20221027-3.7.aarch64.rpm"
RPM_HASH = "2ee26f59b11ec3dfbe2771a90718aad26cdf1fc0f52e675af4e8dc6adc2840d23770641253a50a492cf69a29c7758029854ae09a22be4b6a66dcad17a6da5d9e"

RPROVIDES:${PN} += "libscca-devel \
libscca-devel(aarch-64) \
pkgconfig(libscca)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libscca1"

inherit rpm
