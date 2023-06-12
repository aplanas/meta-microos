SUMMARY = "Upstream Branding for xfce4-panel"
DESCRIPTION = "This package provides the upstream look and feel for xfce4-panel."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.4"

RPM_NAME = "xfce4-panel-branding-upstream-4.18.4-1.1.noarch.rpm"
RPM_HASH = "2e4cea23cd2f0e9a34cea57e771ab1e1fd3419e97ddfa0e12425611fde311757bb71260d8da1f24b2dd7347c48637e5527b6bca4a3b04591b78d43754ac8b92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-panel-branding-upstream) xfce4-panel-branding xfce4-panel-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
