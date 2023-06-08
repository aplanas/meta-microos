SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "gio-branding-upstream-2.76.2-1.1.noarch.rpm"
RPM_HASH = "02dab47c73601f03bc6ac31f22a40123a6b28a38a8af858c8fcb34927f3f2ccd6dde29f54d37cce43b7301a8ef0e9a7b6e144c77535c6241699c3bfeee7f8a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gio-branding-upstream) gio-branding gio-branding-upstream glib2-branding-upstream"
RDEPENDS:${PN} += "libgio-2_0-0"

inherit rpm
