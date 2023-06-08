SUMMARY = "YaST2 - Services Manager"
DESCRIPTION = "Provides user interface and libraries to configure systemd \
services and targets."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-services-manager-4.6.0-1.1.noarch.rpm"
RPM_HASH = "5110e6c77b7cc0800598f01d6e722103293e45f3765285eb7a1fe049bb879fa94ee3046f49a1534b08c029ed9a4fd9f4dc40b102ceea725112f7a59b8b247755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.ServicesManager.desktop) metainfo() metainfo(org.opensuse.yast.ServicesManager.metainfo.xml) yast2-services-manager"
RDEPENDS:${PN} += "ruby yast2 yast2-ruby-bindings"

inherit rpm
