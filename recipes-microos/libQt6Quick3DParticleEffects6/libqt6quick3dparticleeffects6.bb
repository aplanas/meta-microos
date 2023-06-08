SUMMARY = "Qt 6 Quick3DParticleEffects library"
DESCRIPTION = "The Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DParticleEffects6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7821303fed8cc393c330770c5cf2db64319fb512bcd7336534ab7208806c363b7ceaee06ef39365e02dc406c6006c0c95e4ca7284628151099a10a6144dc4c15"

RPROVIDES:${PN} += "libQt6Quick3DParticleEffects.so.6()(64bit) libQt6Quick3DParticleEffects6 libQt6Quick3DParticleEffects6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
