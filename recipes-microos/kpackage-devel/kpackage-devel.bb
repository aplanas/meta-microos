SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets. \
Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kpackage-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1bae67a45f3b75619a50d1841b4bbbe2fe4f4d9f2a133be80f9403c3cdc66362ca79713ae1bcdcb2c6215eeee025648e897c446814a16ce434a9b82cc067a285"

RPROVIDES:${PN} += "cmake(KF5Package) \
kpackage-devel \
kpackage-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) \
extra-cmake-modules \
kpackage"

inherit rpm
