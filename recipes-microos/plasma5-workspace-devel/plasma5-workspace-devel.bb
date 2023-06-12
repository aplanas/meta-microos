SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-workspace-devel-5.27.5-2.4.aarch64.rpm"
RPM_HASH = "d957c3e025caf982da46f2f8dc0d4d513193fe33df1784fa3527192d7e784d0f73e9ed84d3b47b88c3bb05e957adaccd897bddaae11fad008c263877ba0134e4"

RPROVIDES:${PN} += "cmake(KRunnerAppDBusInterface) \
cmake(KSMServerDBusInterface) \
cmake(LibColorCorrect) \
cmake(LibKWorkspace) \
cmake(LibNotificationManager) \
cmake(LibTaskManager) \
plasma-workspace5-devel \
plasma5-workspace-devel \
plasma5-workspace-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5SysGuard) \
cmake(KF5Wayland) \
cmake(Qt5Core) \
cmake(Qt5Gui) \
cmake(Qt5Quick) \
plasma5-workspace-libs"

inherit rpm
