SUMMARY = "YaST2 - Installation Parts"
DESCRIPTION = "System installation code as present on installation media."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-installation-4.6.2-1.1.noarch.rpm"
RPM_HASH = "3d0e7cfe20e181ad83f4349f5f81b427c491a35edb7a021a924a37c2bef09b7215b5c24db1f6b2f37e747a3cae6c8681a14332dceec8d9b97cc227f5d23c7c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.Installation.desktop) application(org.opensuse.yast.ReleaseNotes.desktop) application(org.opensuse.yast.Upgrade.desktop) metainfo() metainfo(org.opensuse.yast.Installation.metainfo.xml) metainfo(org.opensuse.yast.ReleaseNotes.metainfo.xml) metainfo(org.opensuse.yast.Upgrade.metainfo.xml) yast2-installation"
RDEPENDS:${PN} += "(yast2-x11 >= 4.5.1 if libyui-qt) /bin/bash /bin/sh /usr/bin/env /usr/bin/mkdir /usr/bin/ruby /usr/bin/touch augeas-lenses coreutils fillup gzip initviocons iproute2 pciutils systemd tar yast2 yast2-bootloader yast2-country yast2-country-data yast2-network yast2-packager yast2-pkg-bindings yast2-proxy yast2-ruby-bindings yast2-security yast2-services-manager yast2-storage-ng yast2-users"

inherit rpm
