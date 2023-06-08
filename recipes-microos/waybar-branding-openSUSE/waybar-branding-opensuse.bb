SUMMARY = "openSUSE branding of waybar"
DESCRIPTION = "This package provides the openSUSE look and feel for waybar."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "waybar-branding-openSUSE-0.15.1-1.1.noarch.rpm"
RPM_HASH = "177d3df3a4c3d125555db0aeaf9df07412d11ca0d5bb267e77e6df5adca8638f1621b5b1c0cad7b8810a8289de88bc21fc71236028e358bc83314c362fa7000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(waybar-branding-openSUSE) waybar-branding waybar-branding-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
