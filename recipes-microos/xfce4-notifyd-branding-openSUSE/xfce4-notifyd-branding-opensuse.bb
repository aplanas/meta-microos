SUMMARY = "openSUSE Branding of xfce4-notifyd"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Notification Daemon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-notifyd-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "f19e675d7ee30dabec0a9c66adac9c9592ea12df3a71e8c227723620f18a952b82c30785fc99537e836a7b964879574a3b079315a9c332560a6cf3e9a184e564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-notifyd-branding-openSUSE) \
xfce4-notifyd-branding \
xfce4-notifyd-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
