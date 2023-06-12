SUMMARY = "YaST2 - Storage Configuration"
DESCRIPTION = "This package contains the files for YaST2 that handle access to disk \
devices during installation and on an installed system. \
This YaST2 module uses libstorage-ng."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.10"

RPM_NAME = "yast2-storage-ng-4.6.10-1.1.aarch64.rpm"
RPM_HASH = "5675884786d06c04dc3baad9011e6cc509da24c919985c04a154ef91d79549855440f4f22943080bceb79e309d8745d80690a92a60362492b7b32fcc9716a717"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.Disk.desktop) metainfo() metainfo(org.opensuse.yast.Disk.metainfo.xml) yast2-storage-ng yast2-storage-ng(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch fillup findutils libstorage-ng-ruby rubygem(ruby:3.2.0:ruby-dbus) yast2 yast2-packager yast2-ruby-bindings yast2-ycp-ui-bindings"

inherit rpm
