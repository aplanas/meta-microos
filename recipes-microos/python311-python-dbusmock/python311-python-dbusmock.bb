SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24.1"

RPM_NAME = "python311-python-dbusmock-0.24.1-3.1.noarch.rpm"
RPM_HASH = "4927e93021b1fcdd10a51ef030203221e37c1508eb43a6764ad40eb404ce7043ddae722da8395808a0de4e87cb5cdfcf0f1f1ca156961e3fffacf2cb42b6ba05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-dbusmock) python311-dbusmock python311-python-dbusmock python3dist(python-dbusmock)"
RDEPENDS:${PN} += "dbus-1-x11 python(abi) python311-dbus-python python311-gobject typelib(GLib)"

inherit rpm
