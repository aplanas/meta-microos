SUMMARY = "Upstream branding of waybar"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "0.9.17"

RPM_NAME = "waybar-branding-upstream-0.9.17-2.1.noarch.rpm"
RPM_HASH = "1bb2c430c77a6f6ea50480d6a7d561b965908de1cc7df5e5d302b982ba58774d23ba83ef34624986cfa236efbd8e50a0bd7650e4e92c347b04e71e0bcc4cf555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(waybar-branding-upstream) waybar-branding waybar-branding-upstream"
RDEPENDS:${PN} += "waybar"

inherit rpm
