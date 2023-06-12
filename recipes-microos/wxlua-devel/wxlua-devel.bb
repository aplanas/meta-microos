SUMMARY = "Development files of libwxlua"
DESCRIPTION = "This package contains files to be used in your C++ programs to embed a Lua \
interpreter with the wxWidgets API."
LICENSE = "GPL-2.0-or-later-WITH-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "wxlua-devel-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "38661df64fcafd445ea92c4419a65ca762858a17b36ee44e294d6c3e0c8bd64386991d9b49bd3d40e89017a3bcd9b791e72e3486e3cc3f0c576d80803a0df1ab"

RPROVIDES:${PN} += "wxlua-devel \
wxlua-devel(aarch-64)"
RDEPENDS:${PN} += "libwxlua"

inherit rpm
