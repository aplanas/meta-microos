SUMMARY = "YaST2 - Services Manager"
DESCRIPTION = "Provides user interface and libraries to configure systemd \
services and targets."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-services-manager-4.6.1-1.1.noarch.rpm"
RPM_HASH = "40cb61300e38ffbe3a347b5939c316e5fc3ccead472d820c0da29fc559cd21fb4d00a4a395745396fb25a28429f8dda9543eaae72d5ce6002f366168434cd978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.ServicesManager.desktop) \
metainfo() \
metainfo(org.opensuse.yast.ServicesManager.metainfo.xml) \
yast2-services-manager"
RDEPENDS:${PN} += "ruby \
yast2 \
yast2-ruby-bindings"

inherit rpm
