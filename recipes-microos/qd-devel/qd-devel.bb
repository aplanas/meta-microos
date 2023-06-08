SUMMARY = "Development files for qd"
DESCRIPTION = "The qd-devel package contains libraries and header files for \
developing applications that use qd."
LICENSE = "BSD-3-Clause-LBNL"

PV = "2.3.23"

RPM_NAME = "qd-devel-2.3.23-1.2.aarch64.rpm"
RPM_HASH = "3501871e712f34acc5bd77d365fc27d0c38242f540523ac8473a3069fa813c1839c104d491d1678ac92eb3f02e91f710363d05c7c8428b979d2715a3db5e8478"

RPROVIDES:${PN} += "pkgconfig(qd) qd-devel qd-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libqd0"

inherit rpm
