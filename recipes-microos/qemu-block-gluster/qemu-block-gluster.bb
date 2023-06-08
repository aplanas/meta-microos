SUMMARY = "GlusterFS block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over a \
GlusterFS network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-block-gluster-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "3dbb70458cee2c2c7a539ed157b3d68ccd4d12c9d7d87cebc05983a92fd07871e778f9cda48390f2010dfff1cbe917bcc9c33cc2e1391bf2acf87597796b4770"

RPROVIDES:${PN} += "qemu-block-gluster qemu-block-gluster(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgfapi.so.0()(64bit) libgfapi.so.0(GFAPI_3.4.0)(64bit) libgfapi.so.0(GFAPI_3.5.0)(64bit) libgfapi.so.0(GFAPI_6.0)(64bit)"

inherit rpm
