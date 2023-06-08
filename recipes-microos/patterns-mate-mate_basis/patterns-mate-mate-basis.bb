SUMMARY = "MATE Base System"
DESCRIPTION = "Base packages for the MATE desktop environment."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_basis-20170319-5.3.aarch64.rpm"
RPM_HASH = "85a3bc9640ae8ffa595fdcee430f1ae0de94604cf726715786b2d992fc18b52ff239e6f5e313054f648e37b90745b939f669bb2574e651e3b6aab4d96f51a514"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-mate-mate_basis patterns-mate-mate_basis(aarch-64)"
RDEPENDS:${PN} += "caja dbus(org.freedesktop.Notifications) lightdm marco mate-control-center mate-desktop mate-panel mate-session-manager mate-settings-daemon pattern() xdg-desktop-portal-gtk"

inherit rpm
