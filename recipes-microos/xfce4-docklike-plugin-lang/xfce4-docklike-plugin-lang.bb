SUMMARY = "Translations for package xfce4-docklike-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-docklike-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "xfce4-docklike-plugin-lang-0.4.1-1.1.noarch.rpm"
RPM_HASH = "57d16f3f08ae292892bb02047f444bdef38d2cdb53d0e71718fb99d2ccad4209a80674ed185f510d2f36ad9d3dc946c8aa072dd5ff868d3dbd357325081e09ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-docklike-plugin:bg) locale(xfce4-docklike-plugin:ca) locale(xfce4-docklike-plugin:da) locale(xfce4-docklike-plugin:de) locale(xfce4-docklike-plugin:el) locale(xfce4-docklike-plugin:es) locale(xfce4-docklike-plugin:fi) locale(xfce4-docklike-plugin:fr) locale(xfce4-docklike-plugin:he) locale(xfce4-docklike-plugin:hr) locale(xfce4-docklike-plugin:id) locale(xfce4-docklike-plugin:it) locale(xfce4-docklike-plugin:ja) locale(xfce4-docklike-plugin:ko) locale(xfce4-docklike-plugin:lt) locale(xfce4-docklike-plugin:nb) locale(xfce4-docklike-plugin:nl) locale(xfce4-docklike-plugin:pl) locale(xfce4-docklike-plugin:pt) locale(xfce4-docklike-plugin:pt_BR) locale(xfce4-docklike-plugin:ru) locale(xfce4-docklike-plugin:sk) locale(xfce4-docklike-plugin:sl) locale(xfce4-docklike-plugin:sq) locale(xfce4-docklike-plugin:sr) locale(xfce4-docklike-plugin:sv) locale(xfce4-docklike-plugin:tr) locale(xfce4-docklike-plugin:uk) locale(xfce4-docklike-plugin:zh_CN) locale(xfce4-docklike-plugin:zh_TW) xfce4-docklike-plugin-lang xfce4-docklike-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-docklike-plugin"

inherit rpm
