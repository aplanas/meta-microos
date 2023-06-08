SUMMARY = "Development Files for xfce4-sensors-plugin"
DESCRIPTION = "This package contains the development files needed to develop applications \
based on libxfce4sensors."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "xfce4-sensors-plugin-devel-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "908c70ace65954802e8ae5beabe6b0493e32170381812bd338f0cc66d65f805531c24fc516a9a5f5719894f2156cc3709ce6438af59de4c60d094c047dff1d29"

RPROVIDES:${PN} += "pkgconfig(libxfce4sensors-1.0) xfce4-panel-plugin-sensors-devel xfce4-sensors-plugin-devel xfce4-sensors-plugin-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(libxfce4ui-2) pkgconfig(libxfce4util-1.0) xfce4-panel xfce4-sensors-plugin"

inherit rpm
