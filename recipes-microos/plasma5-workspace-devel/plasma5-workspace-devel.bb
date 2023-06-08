SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4.1"

RPM_NAME = "plasma5-workspace-devel-5.27.4.1-2.2.aarch64.rpm"
RPM_HASH = "964d9ee4af41c5dc834b752963945eac08c54985a153a2badae5ed5ab24db78e226249a0f4c89d40b8838fcb7f6c248b75a866dcff78980198bf3592cb5e3f3e"

RPROVIDES:${PN} += "cmake(KRunnerAppDBusInterface) cmake(KSMServerDBusInterface) cmake(LibColorCorrect) cmake(LibKWorkspace) cmake(LibNotificationManager) cmake(LibTaskManager) plasma-workspace5-devel plasma5-workspace-devel plasma5-workspace-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5SysGuard) cmake(KF5Wayland) cmake(Qt5Core) cmake(Qt5Gui) cmake(Qt5Quick) plasma5-workspace-libs"

inherit rpm
