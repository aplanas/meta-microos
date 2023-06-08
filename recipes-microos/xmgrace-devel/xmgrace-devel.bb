SUMMARY = "Grace library"
DESCRIPTION = "Grace is a WYSIWYG 2D plotting tool for the X Window System and M*tif. \
Grace is a descendant of ACE/gr, also known as Xmgr. It knows a lot of \
different graph types and supports a lot of output formats. This devel \
package contains a library to work with grace from other applications. \
 \
For further information consult the main package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.25"

RPM_NAME = "xmgrace-devel-5.1.25-4.6.aarch64.rpm"
RPM_HASH = "106ac200c3df202676ba21698615188a47a160b8bf140550ee7762f5f3f0672c29ac4065b642fec1a30081c143b86f98ed4139fe8a7e33fe8d91e01edcc792dd"

RPROVIDES:${PN} += "xmgrace-devel xmgrace-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
