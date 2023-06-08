SUMMARY = "Library for KDE Education Applications: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE education applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkeduvocdocument-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0f42c40cb9fc484a994171801461ceae65d3d0bb2aa722a46207e1889a8d6ed4446e992a579a889b1d1ad241e93402318d0dd006c86721b342206dcc24a07a46"

RPROVIDES:${PN} += "cmake(LibKEduVocDocument) libkeduvocdocument-devel libkeduvocdocument-devel(aarch-64)"
RDEPENDS:${PN} += "libKEduVocDocument5"

inherit rpm
