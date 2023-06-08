SUMMARY = "Shared GSettings Schemas for the Desktop -- Development Files"
DESCRIPTION = "A collection of GSettings schemas for settings shared by various \
components of a desktop. \
 \
This package contains development files."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gsettings-desktop-schemas-devel-44.0-1.1.aarch64.rpm"
RPM_HASH = "114802a2bf9e6d49281b8e224099763f3489f42899e47cb42aad3555df2f16c0bcf200d1f80428768cb87fd8b74d81f9e1371e62b0efa3772e6cb8cb40df9063"

RPROVIDES:${PN} += "gsettings-desktop-schemas-devel gsettings-desktop-schemas-devel(aarch-64) pkgconfig(gsettings-desktop-schemas)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gsettings-desktop-schemas"

inherit rpm
