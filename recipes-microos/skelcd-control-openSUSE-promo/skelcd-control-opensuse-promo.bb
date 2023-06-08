SUMMARY = "The openSUSE Installation Control file"
DESCRIPTION = "This package contains the control file used for openSUSE installation."
LICENSE = "MIT"

PV = "20230126"

RPM_NAME = "skelcd-control-openSUSE-promo-20230126-1.2.aarch64.rpm"
RPM_HASH = "6fcc8e973d67c7259c1ad041d3526c2f5d7d180e1d4fd3a43c982f2f7c404ef8035ce75ab73a9c61ffff56b8a4efa59b78f99a6fe97ee43dde1a0bc1b7f9770e"

RPROVIDES:${PN} += "product_control skelcd-control-openSUSE-promo skelcd-control-openSUSE-promo(aarch-64)"
RDEPENDS:${PN} += "autoyast2 kdump release-notes rubygem(ruby:3.2.0:byebug) yast2-add-on yast2-configuration-management yast2-fcoe-client yast2-firewall yast2-installation yast2-iscsi-client yast2-kdump yast2-multipath yast2-network yast2-nfs-client yast2-ntp-client yast2-proxy yast2-qt-branding-openSUSE yast2-services-manager yast2-slp yast2-theme yast2-trans-stats yast2-tune yast2-update yast2-users yast2-x11"

inherit rpm
