SUMMARY = "Library for KDE Education Applications: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE education applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkeduvocdocument-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4ca1044663afac4869f3bd7499e94cb6e5314e7e95c91196d9dff77269f6163194966213e7e292825bf9012654034685038cfe1ab417b3fa312d3d504c02d508"

RPROVIDES:${PN} += "cmake(LibKEduVocDocument) libkeduvocdocument-devel libkeduvocdocument-devel(aarch-64)"
RDEPENDS:${PN} += "libKEduVocDocument5"

inherit rpm
