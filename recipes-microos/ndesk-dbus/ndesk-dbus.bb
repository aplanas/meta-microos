SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is a C# implementation of D-Bus. It's often referred to as \
'managed D-Bus' to avoid confusion with existing bindings (which wrap \
libdbus). \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.6.1a"

RPM_NAME = "ndesk-dbus-0.6.1a-1.6.noarch.rpm"
RPM_HASH = "9484c5598abdfd8576202ac0ef91cf38398cc51f4a0920a79862844326474ef3e5da57f9f202422ef46aa62c8af8fbec1b644ce2c03423a55fa3b0549eacdee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(NDesk.DBus) \
ndesk-dbus \
ndesk-dbus-devel \
pkgconfig(ndesk-dbus-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono(System) \
mono(System.Xml) \
mono(mscorlib)"

inherit rpm
