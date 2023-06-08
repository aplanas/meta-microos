SUMMARY = "Info Files for XEmacs"
DESCRIPTION = "This package contains all info files for XEmacs. All these files can be \
read online with XEmacs and describe XEmacs and some of its modes."
LICENSE = "GPL-3.0-or-later"

PV = "21.5.34"

RPM_NAME = "xemacs-info-21.5.34-22.3.noarch.rpm"
RPM_HASH = "cdfa215cea93e277cfc6f3a9efbbe941dcc5c757fce24ff85611422e13766644f413185a145c38129a1e1344499540d8e929522267c7353c4c740f6ca0bfd103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-info"
RDEPENDS:${PN} += "xemacs-packages-info"

inherit rpm
