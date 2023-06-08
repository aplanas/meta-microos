SUMMARY = "Openbox KDE integration"
DESCRIPTION = "This package provides openbox KDE integration and tools"
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-kde-3.6.1-3.31.aarch64.rpm"
RPM_HASH = "7a71c573b60d6ed344e5bd912592d8d056f852fb4f9780e07b27bb66835469b79af588951433ca0f93b9683903e6e10f68e2452b3c16290efd0dbc386253ee2c"

RPROVIDES:${PN} += "openbox-kde openbox-kde(aarch-64)"
RDEPENDS:${PN} += "/bin/sh openbox"

inherit rpm
