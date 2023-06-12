SUMMARY = "Files required to build Hyprland plugins"
DESCRIPTION = "This package contains the neccessary files that are required to \
build plugins for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.26.0"

RPM_NAME = "hyprland-devel-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "a10d7f5fc3a456ce670b01f6405de6afcbfee1bd18c35466ce0eaad824ed564eebf407df549fbdde6fff3c1199d8e4b29f29489494dfed664f880382b5ef54a4"

RPROVIDES:${PN} += "hyprland-devel hyprland-devel(aarch-64) pkgconfig(hyprland)"
RDEPENDS:${PN} += "/usr/bin/pkg-config hyprland"

inherit rpm
