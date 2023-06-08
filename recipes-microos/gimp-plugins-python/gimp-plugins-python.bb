SUMMARY = "The GNU Image Manipulation Program - python-gtk based plugins"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-plugins-python-2.10.34-4.1.aarch64.rpm"
RPM_HASH = "f0c69e072b6d8f9e99b572ebfb73ce8b371d97a782ecfc25604652feb0b397a65c15e49427d2d995ecda3574c6088694f71fbff706fac2e2f2f1021bcdb72e87"

RPROVIDES:${PN} += "gimp-2.0-plugins-python gimp-plugins-python gimp-plugins-python(aarch-64) gimp:/usr/lib64/gimp/2.0/plug-ins/pyconsole.py"
RDEPENDS:${PN} += "/usr/bin/env gimp ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbabl-0.1.so.0()(64bit) libbabl-0.1.so.0(V0_1_0)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libgegl-0.4.so.0()(64bit) libgimp-2.0.so.0()(64bit) libgimpbase-2.0.so.0()(64bit) libgimpcolor-2.0.so.0()(64bit) libgimpconfig-2.0.so.0()(64bit) libgimpthumb-2.0.so.0()(64bit) libgimpui-2.0.so.0()(64bit) libgimpwidgets-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) python-gtk"

inherit rpm
