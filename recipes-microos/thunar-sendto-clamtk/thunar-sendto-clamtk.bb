SUMMARY = "Adds a right-click, context menu to scan files or folders in Thunar"
DESCRIPTION = "All this plugin does is copy a desktop file to Thunar's send-to \
directory.  If this seems redundant, that's because it is: \
this plugin depends on clamtk, which already has this directory \
file. So, it stands to reason we should be able to just find that \
file and copy it, rather than having our own copy."
LICENSE = "GPL-1.0+"

PV = "0.06"

RPM_NAME = "thunar-sendto-clamtk-0.06-1.14.noarch.rpm"
RPM_HASH = "b409429d38c23431af45987b4a656b73e3f4e102f7c9d5c01728f1c73302906875dac8b2367c8e967b9e172871126f2a852cac79bcf346e31a7cfe1dea0b2384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "thunar-sendto-clamtk"
RDEPENDS:${PN} += "clamtk \
thunar"

inherit rpm
