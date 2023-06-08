SUMMARY = "Development files for libnk2"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnk2."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-devel-20221122-3.3.aarch64.rpm"
RPM_HASH = "a832a7911b1a2c295b490ea5a8ce0bbeff67f1023c98e3a3ea2bc0a6b33bc351b73b00e89368a8481c8d8d6fcee8b0327a2bd8358e7555f8be04478f4318da1b"

RPROVIDES:${PN} += "libnk2-devel libnk2-devel(aarch-64) pkgconfig(libnk2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libnk2-1"

inherit rpm
