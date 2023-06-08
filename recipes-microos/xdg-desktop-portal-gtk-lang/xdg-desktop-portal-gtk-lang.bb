SUMMARY = "Translations for package xdg-desktop-portal-gtk"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "xdg-desktop-portal-gtk-lang-1.14.1-3.1.noarch.rpm"
RPM_HASH = "b5aa39655db544c2e31b06070af9a97f9651080b37376166321322b0e60f95af5ba8e0d481b4ccf42b5877473f661dc3701800ccac2ca7a0eaac72e2b6825f3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xdg-desktop-portal-gtk:cs) locale(xdg-desktop-portal-gtk:da) locale(xdg-desktop-portal-gtk:de) locale(xdg-desktop-portal-gtk:en_GB) locale(xdg-desktop-portal-gtk:es) locale(xdg-desktop-portal-gtk:fr) locale(xdg-desktop-portal-gtk:gl) locale(xdg-desktop-portal-gtk:he) locale(xdg-desktop-portal-gtk:hi) locale(xdg-desktop-portal-gtk:hr) locale(xdg-desktop-portal-gtk:hu) locale(xdg-desktop-portal-gtk:id) locale(xdg-desktop-portal-gtk:it) locale(xdg-desktop-portal-gtk:ka) locale(xdg-desktop-portal-gtk:lt) locale(xdg-desktop-portal-gtk:nl) locale(xdg-desktop-portal-gtk:oc) locale(xdg-desktop-portal-gtk:pl) locale(xdg-desktop-portal-gtk:pt) locale(xdg-desktop-portal-gtk:pt_BR) locale(xdg-desktop-portal-gtk:ru) locale(xdg-desktop-portal-gtk:sk) locale(xdg-desktop-portal-gtk:sr) locale(xdg-desktop-portal-gtk:sv) locale(xdg-desktop-portal-gtk:tr) locale(xdg-desktop-portal-gtk:uk) locale(xdg-desktop-portal-gtk:zh_CN) locale(xdg-desktop-portal-gtk:zh_TW) xdg-desktop-portal-gtk-lang xdg-desktop-portal-gtk-lang-all"
RDEPENDS:${PN} += "xdg-desktop-portal-gtk"

inherit rpm
