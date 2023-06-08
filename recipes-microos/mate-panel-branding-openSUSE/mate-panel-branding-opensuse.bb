SUMMARY = "openSUSE Branding of mate-panel"
DESCRIPTION = "This package provides the openSUSE look and feel for the MATE Panel."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-panel-branding-openSUSE-42.1-5.3.noarch.rpm"
RPM_HASH = "b8536cbc8a8198906006f6aded6bfde8d2aeae843ac2f1159aabb52251598f2ceb8ea96aeed803976562af1a1282e52025fe08b727df5339e6d8dd44e4c1c92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-panel-branding mate-panel-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh mate-applet-softupd mate-applets mate-menu mate-panel"

inherit rpm
