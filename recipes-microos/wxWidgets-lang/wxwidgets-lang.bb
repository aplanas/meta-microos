SUMMARY = "Translations for wxWidgets"
DESCRIPTION = "Provides translations for wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-lang-3.0.5.1-3.1.noarch.rpm"
RPM_HASH = "6d13c784e36a2657863824c39794bd0c29f8df16d071ea5fa4eb45be460cdf658d661fd3989ae6d3d0b1084ea3babcbf47a8d33bea70da19d8eb2685e3105618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wxWidgets:ca) locale(wxWidgets:cs) locale(wxWidgets:da) locale(wxWidgets:de) locale(wxWidgets:el) locale(wxWidgets:es) locale(wxWidgets:fi) locale(wxWidgets:fr) locale(wxWidgets:hu) locale(wxWidgets:id) locale(wxWidgets:it) locale(wxWidgets:ja) locale(wxWidgets:nl) locale(wxWidgets:pl) locale(wxWidgets:ru) locale(wxWidgets:sl) locale(wxWidgets:sv) locale(wxWidgets:tr) locale(wxWidgets:uk) locale(wxWidgets:zh_CN) locale(wxWidgets:zh_TW) wxWidgets-lang wxWidgets-lang-all"
RDEPENDS:${PN} += ""

inherit rpm
