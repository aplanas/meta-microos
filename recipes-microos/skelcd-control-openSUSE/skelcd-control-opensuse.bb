SUMMARY = "The openSUSE Installation Control file"
DESCRIPTION = "This package contains the control file used for openSUSE installation."
LICENSE = "MIT"

PV = "20230126"

RPM_NAME = "skelcd-control-openSUSE-20230126-1.2.aarch64.rpm"
RPM_HASH = "46f2e407cd15d61ae0cb6c5e76a57493d58325c40e9e62354bab64e91838e04488469374dcfabf92799d01de9dade883556a89504c1586ce8965b7d589b3b79a"

RPROVIDES:${PN} += "product_control skelcd-control-openSUSE skelcd-control-openSUSE(aarch-64)"
RDEPENDS:${PN} += "autoyast2 kdump release-notes rubygem(ruby:3.2.0:byebug) yast2-add-on yast2-configuration-management yast2-fcoe-client yast2-firewall yast2-installation yast2-iscsi-client yast2-kdump yast2-multipath yast2-network yast2-nfs-client yast2-ntp-client yast2-proxy yast2-qt-branding-openSUSE yast2-services-manager yast2-slp yast2-theme yast2-trans-stats yast2-tune yast2-update yast2-users yast2-x11"

inherit rpm
