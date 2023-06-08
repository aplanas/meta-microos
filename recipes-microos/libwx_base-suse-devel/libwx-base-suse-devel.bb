SUMMARY = "Development files for wxGTK3-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. \
This package is a build artifact and need not be manually installed."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_base-suse-devel-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "694d302deaf79411a18d34b8b82ee6249d8c09ae70890e6df409fe3a85855ae02153df94f147af3a50891198b17ceb2ba0c21a57fe6bfc31264d77be5bcd785e"

RPROVIDES:${PN} += "libwx_base-devel libwx_base-suse-devel libwx_base-suse-devel(aarch-64)"
RDEPENDS:${PN} += "libwx_baseu-suse9_0_0 libwx_baseu_net-suse9_0_0 libwx_baseu_xml-suse9_0_0"

inherit rpm
