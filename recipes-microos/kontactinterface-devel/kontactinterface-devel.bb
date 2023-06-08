SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kontactinterface-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "4a6ffef4d88b8a2b03731d271eff51ad86a9b7048f742c48ab70344791e961dff656b2aa0d5e2a6a24ee36d25d4674001ded88eb9b38486878d659fedb0a4b3a"

RPROVIDES:${PN} += "cmake(KF5KontactInterface) cmake(KPim5KontactInterface) kontactinterface-devel kontactinterface-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Parts) libKPim5KontactInterface5"

inherit rpm
