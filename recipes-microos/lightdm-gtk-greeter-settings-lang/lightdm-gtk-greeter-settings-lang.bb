SUMMARY = "Translations for package lightdm-gtk-greeter-settings"
DESCRIPTION = "Provides translations for the 'lightdm-gtk-greeter-settings' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "lightdm-gtk-greeter-settings-lang-1.2.2-1.14.noarch.rpm"
RPM_HASH = "877d0d3a7f0af71bb897baa6df1898f601f38c875945bb465e8f75ec6d351882915d9d88bb90d61c9875dceaa4a2caf97c0beb2af2d4144b09aa00db7a363420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-gtk-greeter-settings-lang lightdm-gtk-greeter-settings-lang-all locale(lightdm-gtk-greeter-settings:ar) locale(lightdm-gtk-greeter-settings:br) locale(lightdm-gtk-greeter-settings:ca) locale(lightdm-gtk-greeter-settings:cs) locale(lightdm-gtk-greeter-settings:da) locale(lightdm-gtk-greeter-settings:de) locale(lightdm-gtk-greeter-settings:el) locale(lightdm-gtk-greeter-settings:es) locale(lightdm-gtk-greeter-settings:fi) locale(lightdm-gtk-greeter-settings:fr) locale(lightdm-gtk-greeter-settings:hr) locale(lightdm-gtk-greeter-settings:it) locale(lightdm-gtk-greeter-settings:ja) locale(lightdm-gtk-greeter-settings:kk) locale(lightdm-gtk-greeter-settings:lt) locale(lightdm-gtk-greeter-settings:nl) locale(lightdm-gtk-greeter-settings:pl) locale(lightdm-gtk-greeter-settings:pt) locale(lightdm-gtk-greeter-settings:pt_BR) locale(lightdm-gtk-greeter-settings:ru) locale(lightdm-gtk-greeter-settings:sr) locale(lightdm-gtk-greeter-settings:sv) locale(lightdm-gtk-greeter-settings:zh_CN)"
RDEPENDS:${PN} += "lightdm-gtk-greeter-settings"

inherit rpm
