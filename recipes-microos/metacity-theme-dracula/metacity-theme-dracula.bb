SUMMARY = "Dracula Metacity themes"
DESCRIPTION = "This package contains the metacity themes."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "metacity-theme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "4725ce48288112d9ddfa5c450308644b1e5e23e9d12f789c4f8d51469afee2770a7ca573c0af4bd4db33e0d1d69a13ad3c02bfc33d253fa3cfd4427dbbfb830b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme metacity-theme-dracula"
RDEPENDS:${PN} += "metacity metatheme-dracula-common"

inherit rpm
