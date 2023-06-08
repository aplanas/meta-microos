SUMMARY = "Library and components for secure lock screen architecture - development files"
DESCRIPTION = "Development files for Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kscreenlocker-devel-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "7fa51eefb15e867e062b06818aaa9e6ab411b5adc9620f2a9d8ed3608fb4cec2d99ffd0df478c2167a579dd00bb76ed2be196f93eeba4cb49c28f3d88871873f"

RPROVIDES:${PN} += "cmake(KScreenLocker) cmake(ScreenSaverDBusInterface) kscreenlocker-devel kscreenlocker-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) cmake(Qt5X11Extras) libKScreenLocker5"

inherit rpm
