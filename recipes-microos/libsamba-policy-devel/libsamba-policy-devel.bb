SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "libsamba-policy-devel-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "e123ee807aff356d8be0f8f1c0347fbb304023d22d07d7b17172d12b7aaf259796fe6a6e7df3ae0eec0f49963d34403dc023957ce0d5df646cd58b5279106236"

RPROVIDES:${PN} += "libsamba-policy-devel \
libsamba-policy-devel(aarch-64)"
RDEPENDS:${PN} += "libsamba-policy-python3-devel"

inherit rpm
