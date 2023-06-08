SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-session-manager-branding-upstream-1.26.0-2.4.noarch.rpm"
RPM_HASH = "394a4b7073b857379f69ccbdc6805b9bc20a8bc682a3fe51ad84be70e39422a361b9e582b910c4f4bce12017bc472f4fc5c2b03338cc2e8094d49c211c880137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-session-manager-branding-upstream) mate-session-manager-branding mate-session-manager-branding-upstream"
RDEPENDS:${PN} += "mate-session-manager"

inherit rpm
