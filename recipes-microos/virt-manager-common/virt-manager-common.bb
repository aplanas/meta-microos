SUMMARY = "Common files used by the different Virtual Machine Manager interfaces"
DESCRIPTION = "Common files used by the different virt-manager interfaces, as well as \
virt-install related tools."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-manager-common-4.1.0-8.1.noarch.rpm"
RPM_HASH = "aa0a22c3ac3113838ec2465291a3736cc64f86cf87b48ad3a3d963eb6b927570d5d53f85bf3e1bd193c254cb3eb2ccaeb9e5dae603ce22278602e5b8e71ecc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-manager-common"
RDEPENDS:${PN} += "libosinfo mkisofs python3-gobject python3-ipaddr python3-libvirt-python python3-libxml2-python python3-pycurl typelib(AppIndicator3) typelib(Libosinfo) typelib(LibvirtGLib) xorriso"

inherit rpm
