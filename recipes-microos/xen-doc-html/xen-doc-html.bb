SUMMARY = "Xen Virtualization: HTML documentation"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
xen-doc-html contains the online documentation in HTML format. Point \
your browser at file:/usr/share/doc/packages/xen/html/ \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_02"

RPM_NAME = "xen-doc-html-4.17.1_02-1.1.aarch64.rpm"
RPM_HASH = "f972d12dd806d6a9159482bd8c5f08e7b4b2bf7670db541374c571185a3140d28aeedbb8b7c6b295d749f701ecc3237ec1e7b0760abd0a31ed02c9ec0b1d746e"

RPROVIDES:${PN} += "xen-doc-html xen-doc-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
