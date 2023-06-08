SUMMARY = "Shared library for Budgie raven plugins"
DESCRIPTION = "Shared library for budgie raven plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "libbudgie-raven-plugin0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "f4078f01739cb761e2b0c7b518211cbefbc48568c5670f06fe7441c8a70c4737fee63847d4d8905c0cf6e6b822c269ac958dedbd6eb17d363a039e5f5028aa20"

RPROVIDES:${PN} += "libbudgie-raven-plugin.so.0()(64bit) libbudgie-raven-plugin0 libbudgie-raven-plugin0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
