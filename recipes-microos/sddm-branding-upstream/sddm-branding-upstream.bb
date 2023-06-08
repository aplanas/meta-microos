SUMMARY = "Upstream branding for SDDM, a QML-based display manager"
DESCRIPTION = "SDDM is a display manager for X11. It uses technologies like QtQuick, \
which in turn gives the designer the ability to create animated user \
interfaces. \
This package provides upstream branding for SDDM."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.0"

RPM_NAME = "sddm-branding-upstream-0.19.0-11.1.aarch64.rpm"
RPM_HASH = "f04ef9977388a19e6402aaec10adf9fd517e1b901faf30c52cc32d05f7397194e6285fadccb3896c1f159995055ada0aaa5e8e18ab8bf5999af5b6f25f06a244"

RPROVIDES:${PN} += "sddm-branding sddm-branding-upstream sddm-branding-upstream(aarch-64)"
RDEPENDS:${PN} += "/bin/sh diffutils sddm"

inherit rpm
