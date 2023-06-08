SUMMARY = "Development files for wxWidgets-3_2-nostl"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. \
This package is a build artifact and need not be manually installed."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_base-suse-nostl-devel-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "72fdda557b12bff9dba3b067485d8b5f863d549bbfe7fe7c3a8e1694a286b4fe69a0197cf42be931a17fafd62c9ecfc51ffa894213d4fba0390a2ef4841b7b03"

RPROVIDES:${PN} += "libwx_base-devel libwx_base-suse-nostl-devel libwx_base-suse-nostl-devel(aarch-64)"
RDEPENDS:${PN} += "libwx_baseu-suse-nostl9_0_0 libwx_baseu_net-suse-nostl9_0_0 libwx_baseu_xml-suse-nostl9_0_0"

inherit rpm
