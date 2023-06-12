SUMMARY = "Ubuntu Mono Icon theme"
DESCRIPTION = "Dark and Light panel icons to make desktop beautiful."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "ubuntu-mono-icon-theme-20.10-2.2.noarch.rpm"
RPM_HASH = "308c1e39890fb14f3e60d2215bcbe59f493041c328095a20272e9414e5309b04368685e74889f39d04e4b810993aa7bfade0b6202f668d1d29b71bad91cae3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ubuntu-mono \
ubuntu-mono-icon-theme"
RDEPENDS:${PN} += "adwaita-icon-theme \
hicolor-icon-theme \
humanity-icon-theme"

inherit rpm
