SUMMARY = "Vacuum-IM User Tune Handler plugin"
DESCRIPTION = "This plugin provides support to XEP-0118: defines a payload format for \
communicating information about music to which a user is listening, including \
the title, track number, collection, performer, composer, length, and user \
rating. The payload format is typically transported using the personal eventing \
protocol, a profile of XMPP publish-subscribe specified in XEP-0163."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "vacuum-im-plugins-usertune-1.1.3-1.23.aarch64.rpm"
RPM_HASH = "30929263090fd9b5a11e56b3b636e7dc376db0163f4d3e27888f117d1d67bdd1ff4999af2b706a237c9b5599283df3f0d7a526531860834e5a6edf0d0bb8e93f"

RPROVIDES:${PN} += "libusertune.so()(64bit) \
vacuum-im-plugins-usertune \
vacuum-im-plugins-usertune(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvacuumutils.so.37()(64bit)"

inherit rpm
