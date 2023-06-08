SUMMARY = "Upstream Branding of libxfce4ui"
DESCRIPTION = "This package provides the upstream look and feel for libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.3"

RPM_NAME = "libxfce4ui-branding-upstream-4.18.3-1.1.noarch.rpm"
RPM_HASH = "4d79b2f1f8d2bba3f270a0b5be5ea7b482468f9a6879a756bdeb74f585dfaba25b317eee4ead3f6d2911911f88dfe5e41cd0add43481f751f0749871bcffef80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libxfce4ui-branding-upstream) libxfce4ui-branding libxfce4ui-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
