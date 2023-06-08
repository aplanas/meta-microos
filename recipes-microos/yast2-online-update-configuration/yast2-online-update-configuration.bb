SUMMARY = "Configuration of Online Update"
DESCRIPTION = "Allows to configure automatic online update."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-online-update-configuration-4.6.0-1.1.noarch.rpm"
RPM_HASH = "15f0f19c521521ea67956582dce03a646caaf98b25bda96cb8c0391a9b2ad4f008761ab894bf7e699849afdd47faf164832352528c0cee8629ba80ef4ae19ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.OnlineUpdateConfiguration.desktop) metainfo() metainfo(org.opensuse.yast.OnlineUpdateConfiguration.metainfo.xml) yast2-online-update-configuration yast2-registration:/usr/share/YaST2/clients/online_update_configuration.ycp"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch fillup yast2 yast2-packager yast2-pkg-bindings yast2-ruby-bindings"

inherit rpm
