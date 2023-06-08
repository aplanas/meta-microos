SUMMARY = "Adwaita theme for the Openbox Window Manager"
DESCRIPTION = "This package contains an Openbox theme created to mimic GNOME's Adwaita theme."
LICENSE = "GPL-3.0"

PV = "0.1"

RPM_NAME = "openbox-adwaita-ob-theme-0.1-3.16.noarch.rpm"
RPM_HASH = "f503d0dc4f756dfcfd06bcf064b1d791a1edf231a5a6e473cfe28e7923a670a4b55ac06af6fd8138a6bde88284cbb4378d97feef8e9f897b378fcae35c71325a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openbox-adwaita-ob-theme"
RDEPENDS:${PN} += "openbox"

inherit rpm
