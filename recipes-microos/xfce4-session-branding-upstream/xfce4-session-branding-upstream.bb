SUMMARY = "Upstream Branding of xfce4-session"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Session Manager."
LICENSE = "GPL-2.0-only"

PV = "4.18.2"

RPM_NAME = "xfce4-session-branding-upstream-4.18.2-1.1.noarch.rpm"
RPM_HASH = "63504ba4c2953b220c3dfe62ae6833be2cff3b6902d9660e44e8e0f3a69668f6956f1241076b79e837ff535440f6ee96e43dd61a524a8f914891f3b0090f73f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-session-branding-upstream) xfce4-session-branding xfce4-session-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
