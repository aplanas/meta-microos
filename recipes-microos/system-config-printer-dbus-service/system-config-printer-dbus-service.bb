SUMMARY = "D-Bus service to configure printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This packages provides a D-Bus service to configure printers and manage \
print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-dbus-service-1.5.18-2.1.noarch.rpm"
RPM_HASH = "bd803cf990f4b80233f39cd7a7332ddf2bba58b66ba147163961a74c3bc9a3dbffdf840b35ab34f71d42c9460c1fe5d0b26b352b36c3a1a430eab182b20ea299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-config-printer-dbus-service"
RDEPENDS:${PN} += "/bin/sh system-config-printer-common"

inherit rpm
