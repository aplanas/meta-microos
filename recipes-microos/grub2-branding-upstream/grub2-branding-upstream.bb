SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-branding-upstream-2.06-51.1.aarch64.rpm"
RPM_HASH = "5271ca2adee84926b49baa74e905b8bafa829903cff5f3a315462ba2da8853d349ff36af308aa34d0cd0ef0e803ada5f708075c48d9de8677ada1e08d539b38c"

RPROVIDES:${PN} += "grub2-branding-upstream grub2-branding-upstream(aarch-64)"
RDEPENDS:${PN} += "grub2"

inherit rpm
