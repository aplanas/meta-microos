SUMMARY = "YaST2 - YaST Configuration Management"
DESCRIPTION = "This package contains the YaST2 component for Configuration Management Provisioning."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-configuration-management-4.6.0-1.1.noarch.rpm"
RPM_HASH = "f5ddc687a0de4d143000f28f45e29d781e09635bb76a6884559a9e07ca1db554176e7d4dabfa7cb3708e72f8feab8a69f408f5aa687541aa94bec55d3d850b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.ConfigurationManagement.desktop) metainfo() metainfo(org.opensuse.yast.ConfigurationManagement.metainfo.xml) yast2-configuration-management"
RDEPENDS:${PN} += "yast2 yast2-installation"

inherit rpm
