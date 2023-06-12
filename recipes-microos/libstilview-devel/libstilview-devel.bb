SUMMARY = "Development files for libstilview"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libstilview."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libstilview-devel-2.4.2-2.1.aarch64.rpm"
RPM_HASH = "20730f64e77525aadfb62d8a408bd810831df479b31d4d863071af857e78905469dd0d0bdba2659ea0e5a985e5dcbe81e15b4a067989abe44b10b4e02771602d"

RPROVIDES:${PN} += "libstilview-devel \
libstilview-devel(aarch-64) \
pkgconfig(libstilview)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstilview0"

inherit rpm
