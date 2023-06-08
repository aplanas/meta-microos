SUMMARY = "YaST2 - Storage Configuration"
DESCRIPTION = "This package contains the files for YaST2 that handle access to disk \
devices during installation and on an installed system. \
This YaST2 module uses libstorage-ng."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.5"

RPM_NAME = "yast2-storage-ng-4.6.5-1.1.aarch64.rpm"
RPM_HASH = "4e3632a82a65eee17eb5543eaa9b4d8044582c6ccd92f8b0674727a9dbf78fdcedf8b57c5af18c71907a018fe4d147a252a735a446f41c4b9d842bc112ba688a"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.Disk.desktop) metainfo() metainfo(org.opensuse.yast.Disk.metainfo.xml) yast2-storage-ng yast2-storage-ng(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch fillup findutils libstorage-ng-ruby rubygem(ruby:3.2.0:ruby-dbus) yast2 yast2-packager yast2-ruby-bindings yast2-ycp-ui-bindings"

inherit rpm
