SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets. \
Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kpackage-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "c6377e356f39a09948f722af2106e55ce8260e74cc883dc022c8576292a5af7d6469af598347ea75842e2e52aaa009638c4a1c4e9c152b28c736a44ca848b039"

RPROVIDES:${PN} += "cmake(KF5Package) kpackage-devel kpackage-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) extra-cmake-modules kpackage"

inherit rpm
