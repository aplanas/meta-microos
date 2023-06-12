SUMMARY = "GLib and GObject mapping of libvirt - gi-bindings"
DESCRIPTION = "libvirt is a C toolkit to interact with the virtualization capabilities \
of recent versions of Linux (and other OSes). It is free software \
available under the GNU Lesser General Public License. Virtualization on \
the Linux Operating System means the ability to run multiple instances of \
Operating Systems concurrently on a single hardware system where the basic \
resources are driven by a Linux instance. The library aim at providing \
long term stable C API initially for the Xen paravirtualization but \
should be able to integrate other virtualization mechanisms if needed"
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.0"

RPM_NAME = "typelib-1_0-LibvirtGConfig-1_0-4.0.0-1.10.aarch64.rpm"
RPM_HASH = "6e264e0582fa16f174502d60848a5124c5d94e7f4bdef63b128cc49cb6b048959a129f71b65c9844de9441b0d4898fb76827b54676b0c9005f227c8d0ba5d18d"

RPROVIDES:${PN} += "typelib(LibvirtGConfig) \
typelib-1_0-LibvirtGConfig-1_0 \
typelib-1_0-LibvirtGConfig-1_0(aarch-64)"
RDEPENDS:${PN} += "libvirt-gconfig-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(libxml2)"

inherit rpm
