SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-branding-upstream-1.26.1-1.1.noarch.rpm"
RPM_HASH = "764df6153735f6835712137302d2518ee21792f87bcb0b46bfeacb0d58f31b93d508c79aa4869b5f2448e973d69d91aa3bb30f37515555bc2e8a37cf53a4721d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-session-manager-branding-upstream) \
mate-session-manager-branding \
mate-session-manager-branding-upstream"
RDEPENDS:${PN} += "mate-session-manager"

inherit rpm
