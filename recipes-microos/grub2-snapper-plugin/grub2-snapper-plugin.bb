SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-snapper-plugin-2.06-51.1.noarch.rpm"
RPM_HASH = "4cfb3829d588afe7aab18101e600bc7083dce323d7bde73ea840bccd95ff7161d850ec1a5e02c21a05229c121798d87412d8e29af643675285eac5b7bb6b9673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(grub2-snapper-plugin) grub2-snapper-plugin"
RDEPENDS:${PN} += "/bin/sh grub2 libxml2-tools"

inherit rpm
