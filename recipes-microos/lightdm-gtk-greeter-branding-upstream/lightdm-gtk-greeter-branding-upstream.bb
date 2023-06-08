SUMMARY = "Upstream branding of lightdm-gtk-greeter"
DESCRIPTION = "This package provides the upstream look and feel for lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "lightdm-gtk-greeter-branding-upstream-2.0.8-1.12.noarch.rpm"
RPM_HASH = "9dd7114184cfa0af763245cea6ee8dbfe6653894b6083773e009fa0003f33d7e1899ef05cc61d5d94e1bd4c772555e6caf18af9294c1389f14a4cd1a7c4095be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(lightdm-gtk-greeter-branding-upstream) lightdm-gtk-greeter-branding lightdm-gtk-greeter-branding-upstream"
RDEPENDS:${PN} += "lightdm-gtk-greeter"

inherit rpm
