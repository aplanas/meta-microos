SUMMARY = "Shared GSettings Schemas for the Desktop"
DESCRIPTION = "A collection of GSettings schemas for settings shared by various \
components of a desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "gsettings-desktop-schemas-44.0-1.1.aarch64.rpm"
RPM_HASH = "6b143f2c16277178fc7ce9ac30b800a88f88fe787f73c68d361dab6a7b638214787adcff9a56e4b8fd239a5f64e248c75921cba2f33c678c606d63a7bebead75"

RPROVIDES:${PN} += "gsettings-desktop-schemas gsettings-desktop-schemas(aarch-64) typelib(GDesktopEnums)"
RDEPENDS:${PN} += ""

inherit rpm
